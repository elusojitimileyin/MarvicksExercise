package MBTIPersonalityTest;

import java.util.Scanner;
import java.util.Arrays;

public class MBTIPersonalityTest {

	private static final Scanner input = new Scanner(System.in);
	private static String fullName;
	private static int countA;
	private static int countB;

	private static final char[] arrayEvsIResponses = new char[10];
	private static final char[] arraySvsNResponses = new char[10];
	private static final char[] arrayTvsFResponses = new char[10];
	private static final char[] arrayJvsPResponses = new char[10];
	private static final char[] finalResponse = new char[4];

	public static void main(String[] args) {
		System.out.println("What Is Your Full-Name ");
		fullName = input.nextLine();

		getResponses(arrayEvsIResponses, arrayEvsI);
		getResponses(arraySvsNResponses, arraySvsN);
		getResponses(arrayTvsFResponses, arrayTvsF);
		getResponses(arrayJvsPResponses, arrayJvsP);
		displayResults();
		compareEvsI();
		compareSvsN();
		compareTvsF();
		compareJvP();
		displayFinalResult(finalResponse);

	}

	private static final String[] arrayEvsI = {
			"A. expend energy, enjoy groups",
			"B. conserve energy, enjoy one-on-one",
			"A. more outgoing, think out loud",
			"B. more reserved, think to yourself",
			"A. seek many tasks, public activities, interaction with others",
			"B. seek private, solitary activities with quiet to concentrate",
			"A. external, communicative, express yourself",
			"B. internal, reticent, keep to yourself",
			"A. active, initiate",
			"B. reflective, deliberate"
	};

	private static final String[] arraySvsN = {
			"A. Interpret literally",
			"B. Look for meaning and possibilities",
			"A. Practical, realistic, experiential",
			"B. Imaginative, innovative, theoretical",
			"A. Standard, usual, conventional",
			"B. Different, novel, unique",
			"A. Focus on here-and-now",
			"B. Look to the future, global perspective, big picture",
			"A. Facts, things, what is",
			"B. Ideas, dreams, what could be, philosophical"
	};

	private static final String[] arrayTvsF = {
			"A. Logical, thinking, questioning",
			"B. empathetic, feeling, accommodating",
			"A. candid, straightforward, frank",
			"B. tactful, kind encouraging",
			"A. firm, tend to criticize, hold the line",
			"B. gentle, tend to appreciate, conciliate",
			"A. tough-minded, just",
			"B. tender-hearted, merciful",
			"A. matter of fact, issue-oriented",
			"B. sensitive, people-oriented, compassionate",
	};

	private static final String[] arrayJvsP = {
			"A. Organized, orderly",
			"B. flexible, adaptable",
			"A. plan, schedule",
			"B. unplanned, spontaneous",
			"A. regulated, structured",
			"B. easy-going, live and let live",
			"A. preparation, plan ahead",
			"B. go with the flow, adapt as you go",
			"A. control, govern",
			"B. latitude, freedom"
	};

	private static void getResponses(char[] responses, String[] questions) {
		for (int index = 0; index < questions.length; index += 2) {
			System.out.println(questions[index] + " or " + questions[index + 1] + ":");
			String userResponse = input.nextLine().toUpperCase();
			System.out.println();

			while (!userResponse.equals("A") && !userResponse.equals("B")) {
				System.out.println("Expected response. 'A' or 'B' as Response");
				System.out.println("I Know This Is An Error, Please Retry Again. ");
				System.out.println();
				System.out.println(questions[index] + " or " + questions[index + 1] + ":");
				userResponse = input.nextLine().toUpperCase();
				System.out.println();
			}

			responses[index / 2] = userResponse.charAt(0);
		}
	}


	private static void countA(char[] responses) {
		countA = 0;
		for (char response : responses) {
			if (response == 'A') {
				countA++;
			}
		}
	}

	private static void countB(char[] responses) {
		countB = 0;
		for (char response : responses) {
			if (response == 'B') {
				countB++;
			}
		}
	}


	private static void displayResults() {
		System.out.println("Hello " + fullName + ", You selected:");

		displayCategoryResults("EvsI", arrayEvsI, arrayEvsIResponses);
		displayCategoryResults("SvsN", arraySvsN, arraySvsNResponses);
		displayCategoryResults("TvsF", arrayTvsF, arrayTvsFResponses);
		displayCategoryResults("JvsP", arrayJvsP, arrayJvsPResponses);
	}

	private static void displayCategoryResults(String category, String[] questions, char[] responses) {
		countA = 0;
		countB = 0;

		System.out.println(category + ":");
		for (int check = 0; check < responses.length; check++) {
			if (responses[check] == 'A') {
				System.out.println(questions[check * 2]);
				countA++;
			} else if (responses[check] == 'B') {
				System.out.println(questions[check * 2 + 1]);
				countB++;
			}
		}

		System.out.println("Number of A selected: " + countA);
		System.out.println("Number of B selected: " + countB);
		System.out.println();
	}

	private static void compareEvsI() {
		countA(arrayEvsIResponses);
		countB(arrayEvsIResponses);

		if (countA > countB) {
			finalResponse[0] = 'E';
		} else {
			finalResponse[0] = 'I';
		}
	}

	private static void compareSvsN() {
		countA(arraySvsNResponses);
		countB(arraySvsNResponses);

		if (countA > countB) {
			finalResponse[1] = 'S';
		} else {
			finalResponse[1] = 'N';
		}
	}

	private static void compareTvsF() {
		countA(arrayTvsFResponses);
		countB(arrayTvsFResponses);

		if (countA > countB) {
			finalResponse[2] = 'T';
		} else {
			finalResponse[2] = 'F';
		}
	}

	private static void compareJvP() {
		countA(arrayJvsPResponses);
		countB(arrayJvsPResponses);

		if (countA > countB) {
			finalResponse[3] = 'J';
		} else {
			finalResponse[3] = 'P';
		}
	}


	private static void displayFinalResult(char[] finalResult) {
		if (Arrays.equals(finalResult, new char[]{'I', 'N', 'F', 'P'})) {
			System.out.println("INFP");
			System.out.println("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.\nAlthough they may seem quiet or unassuming, people with the INFP personality type (Mediators) have vibrant, passionate inner lives. Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their mind. INFPs are known for their sensitivity – these personalities can have profound emotional responses to music, art, nature, and the people around them. They are known to be extremely sentimental and nostalgic, often holding onto special keepsakes and memorabilia that brighten their days and fill their heart with joy.\nIdealistic and empathetic, people with the INFP personality type long for deep, soulful relationships, and they feel called to help others. Due to the fast-paced and competitive nature of our society, they may sometimes feel lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique. Yet it is precisely because INFPs brim with such rich sensitivity and profound creativity that they possess the unique potential to connect deeply and initiate positive change.\n\nThe Gift of Empathy\nINFP personalities share a sincere curiosity about the depths of human nature. Introspective to the core, they’re exquisitely attuned to their own thoughts and feelings, but they yearn to understand the people around them as well. INFPs are compassionate and nonjudgmental, always willing to hear another person’s story. When someone opens up to them or turns to them for comfort, they feel honored to listen and be of help.\nEmpathy is among the INFP personality type’s greatest gifts, but at times it can be a liability. The troubles of the world weigh heavily on their shoulders, and these personalities can be vulnerable to internalizing other people’s negative moods or mindsets. Unless they learn to set boundaries, INFPs may feel overwhelmed by just how many wrongs there are that need to be set right.");
		} else if (Arrays.equals(finalResult, new char[]{'I', 'N', 'F', 'J'})) {
			System.out.println("INFJ");
			System.out.println("The Advocate");
			System.out.println("WHO IS THE INFJ PERSONALITY TYPE?\n\nINFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.\n\nTreat people as if they were what they ought to be and you help them to become what they are capable of being.\n\nWhile they have lofty goals and ambitions, INFJs shouldn’t be mistaken for idle dreamers. People with this personality type care about integrity, and they’re rarely satisfied until they’ve done what they know to be right. Conscientious to the core, they move through life with a clear sense of their values, and they aim to never lose sight of what truly matters – not according to other people or society at large but according to their own wisdom and intuition.");
		} else if (Arrays.equals(finalResult, new char[]{'E', 'N', 'F', 'J'})) {
			System.out.println("ENFJ");
			System.out.println("The Protagonist");
			System.out.println("WHO IS THE ENFJ PERSONALITY TYPE?\n\nENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.\n\nWhen the whole world is silent, even one voice becomes powerful.\n\n\nMALALA YOUSAFZAI\nPeople with the ENFJ personality type (Protagonists) feel called to serve a greater purpose in life. Thoughtful and idealistic, ENFJs strive to have a positive impact on other people and the world around them. These personalities rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.\n\n\nENFJs are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships. Few things bring people with the ENFJ personality type a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves.\n\nENFJs possess the unique ability to remain hopeful in the face of difficulties, always remembering that there is something to be grateful for.\n\nSpeaking Up for What’s Right\nENFJs tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust or wrong, they speak up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak in ways that resonate with others.\nENFJ personalities have not only an uncanny ability to pick up on people’s underlying motivations but also a deep well of patience for understanding and listening. When they believe in someone, they can become quite stubborn about giving up on them.\n\nThe Gift of Empathy\nEmpathy is a powerful tool, and ENFJs know how to use it. These personalities can relate to others on an emotional level that goes beyond superficial pleasantries. When someone tells an ENFJ about a problem, whether it’s a minor issue or a major crisis, they can tune into the underlying emotions and provide meaningful support.\nENFJs believe in the potential of other people, and their optimism and determination make them true inspirations.\n\nGuiding Others Toward Growth\nOne of the most fulfilling roles for ENFJs is to help others grow and develop. They thrive in the role of mentor, and they genuinely enjoy being there for others in times of need. ENFJs have a knack for seeing the best in people, even when others can’t see it in themselves. Their encouragement and support can have a profound impact on the people around them, motivating them to strive for their goals and become better versions of themselves.");
		} else if(Arrays.equals(finalResult, new char[] {'E','N','F','P'})){
			System.out.println("ENFP");
			System.out.println("The Campaigner");
			System.out.println("WHO IS THE ENFP PERSONALITY TYPE?\n\nENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.\n\nIt doesn’t interest me what you do for a living. I want to know what you ache for – and if you dare to dream of meeting your heart’s longing.\n\n\nORIAH MOUNTAIN DREAMER\nPeople with the ENFP personality type (Campaigners) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, ENFPs stand out in any crowd. But even though they can be the life of the party, they don’t just care about having a good time. These personalities have profound depths that are fueled by their intense desire for meaningful, emotional connections with others.");

		}else

		if(Arrays.equals(finalResult, new char[] {'I','N','T','J'})){
			System.out.println("INTJ");
			System.out.println("The Architect");
			System.out.println("WHO IS THE INTJ PERSONALITY TYPE?\n\nINTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.\n\nThought constitutes the greatness of man. Man is a reed, the feeblest thing in nature, but he is a thinking reed.\n\n\nBlaise Pascal\nPeople with the INTJ personality type (Architects) are intellectually curious individuals with a deep-seated thirst for knowledge. INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement. They consistently work toward enhancing intellectual abilities and are often driven by an intense desire to master any and every topic that piques their interest.\n\nLogical and quick-witted, INTJs pride themselves on their ability to think for themselves, not to mention their uncanny knack for seeing right through phoniness and hypocrisy. Because their minds are never at rest, these personalities may sometimes struggle to find people who can keep up with their nonstop analysis of everything around them. But when they do find like-minded individuals who appreciate their intensity and depth of thought, INTJs form profound and intellectually stimulating relationships that they deeply treasure.");

		}else

		if(Arrays.equals(finalResult, new char[] {'I','N','T','P'})){
			System.out.println("INTP");
			System.out.println("The Logician");
			System.out.println("WHO IS THE INTP PERSONALITY TYPE?\n\nINTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.\n\nThe important thing is not to stop questioning. Curiosity has its own reason for existence.\n\n\nALBERT EINSTEIN\nPeople with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been INTPs. People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts when they are left to their own devices. They are also incredibly creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from the crowd.");

		}else

		if(Arrays.equals(finalResult, new char[] {'E','N','T','J'})){
			System.out.println("ENTJ");
			System.out.println("The Commander");
			System.out.println("WHO IS THE ENTJ PERSONALITY TYPE?\n\nENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.\n\nYour time is limited, so don’t waste it living someone else’s life.\n\n\nSteve Jobs\nPeople with the ENTJ personality type (Commanders) are natural-born leaders. Embodying the gifts of charisma and confidence, ENTJs project authority in a way that draws crowds together behind a common goal. However, these personalities are also characterized by an often ruthless level of rationality, using their drive, determination, and sharp mind to achieve whatever objectives they’ve set for themselves. Their intensity might sometimes rub people the wrong way, but ultimately, ENTJs take pride in both their work ethic and their impressive level of self-discipline.\nENTJ personalities perceive themselves to be a strong positive influence on others.");

		}else

		if(Arrays.equals(finalResult, new char[] {'E','N','T','P'})){
			System.out.println("ENTP");
			System.out.println("The Debater");
			System.out.println("WHO IS THE ENTP PERSONALITY TYPE?\n\nENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.\n\nQuick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. Few things light up these personalities more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.\n\nIt would be a mistake, though, to think of ENTPs as disagreeable or mean-spirited. Instead, people with this personality type are knowledgeable and curious with a playful sense of humor, and they can be incredibly entertaining. They simply have an offbeat, contrarian idea of fun – one that usually involves a healthy dose of spirited debate.\n\nENTP personalities are the ultimate devil’s advocates, thriving on the process of shredding people’s arguments to pieces. Sometimes they even rebel against their own beliefs by arguing the opposing viewpoint – just to see how the world looks from the other side.");

		}else

		if(Arrays.equals(finalResult, new char[] {'I','S','T','J'})){
			System.out.println("ISTJ");
			System.out.println("The Logistician");
			System.out.println("WHO IS THE ISTJ PERSONALITY TYPE?\n\nISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.\n\nI’d be more frightened by not using whatever abilities I’d been given. I’d be more frightened by procrastination and laziness.\n\n\nDENZEL WASHINGTON\nPeople with the ISTJ personality type (Logisticians) mean what they say and say what they mean, and when they commit to doing something, they make sure to follow through. With their responsible and dependable nature, it might not be so surprising that ISTJ personalities also tend to have a deep respect for structure and tradition. They are often drawn to organizations, workplaces, and educational settings that offer clear hierarchies and expectations.\nWhile ISTJs may not be particularly flashy or attention seeking, they do more than their share to keep society on a sturdy, stable foundation. In their families and their communities, people with this personality type often earn respect for their reliability, their practicality, and their ability to stay grounded and logical in even the most stressful situations.");

		}else

		if(Arrays.equals(finalResult, new char[] {'I','S','F','J'})){
			System.out.println("ISFJ");
			System.out.println("The Defender");
			System.out.println("WHO IS THE ISFJ PERSONALITY TYPE?\n\nISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.\n\nLove only grows by sharing. You can only have more for yourself by giving it away to others.\n\n\nBrian Tracy\nIn their unassuming, understated way, people with the ISFJ personality type (Defenders) help make the world go round. Hardworking and devoted, these personalities feel a deep sense of responsibility to those around them. ISFJs can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.\n\nThis is a capable, can-do personality type with a wealth of versatile gifts. Though sensitive and caring, ISFJs also have excellent analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships. These personalities are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.\n\nISFJs are true altruists, meeting kindness with kindness-in-excess and engaging with the work and people they believe in with enthusiasm and generosity.");

		}else

		if(Arrays.equals(finalResult, new char[] {'E','S','T','J'})){
			System.out.println("ESTJ");
			System.out.println("The Executive");
			System.out.println("WHO IS THE ESTJ PERSONALITY TYPE?\n\nESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.\n\n\nGood order is the foundation of all things.\nEdmund Burke\n\n\nPeople with the ESTJ personality type (Executives) are representatives of tradition and order, utilizing their understanding of what is right, wrong, and socially acceptable to bring families and communities together. Embracing the values of honesty and dedication, ESTJs are valued for their mentorship mindset and their ability to create and follow through on plans in a diligent and efficient manner. They will happily lead the way on difficult paths, and they won’t give up when things become stressful.\n\nESTJs are classic images of the model citizen: they help their neighbors, uphold the law, and try to make sure that everyone participates in the communities and organizations that they hold so dear.");

		}else

		if(Arrays.equals(finalResult, new char[] {'E','S','F','J'})){
			System.out.println("ESFJ");
			System.out.println("The Consul");
			System.out.println("WHO IS THE ESFJ PERSONALITY TYPE?\n\nESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.\n\nEncourage, lift, and strengthen one another. For the positive energy spread to one will be felt by us all.\n\n\nDeborah Day\nFor people with the ESFJ personality type (Consuls), life is sweetest when it’s shared with others. These social individuals form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors.\n\nThis doesn’t mean that they are saints or that they like everyone. In fact, they are much more likely to form close bonds with people who share their same values and opinions. But regardless of other people’s beliefs, ESFJ personalities still strongly believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them. Generous and reliable, they often take it upon themselves – in ways both large and small – to hold their families and their communities together.\n\nESFJs have a talent for making the people in their lives feel supported, cared for, and secure.");

		}else

		if(Arrays.equals(finalResult, new char[] {'I','S','T','P'})){
			System.out.println("ISTP");
			System.out.println("Virtuoso");
			System.out.println("WHO IS THE ISTP PERSONALITY TYPE?\n\nISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.\n\nI wanted to live the life, a different life. I didn’t want to go to the same place every day and see the same people and do the same job. I wanted interesting challenges.\n\n\nHarrison Ford\nPeople with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching and examining the world around them with an impressive diligence, a casual curiosity, and a healthy dose of skepticism. They are natural makers, moving from project to project, building the useful and the superfluous for the fun of it and learning from their environment as they go. They find no greater joy than in getting their hands dirty pulling things apart and putting them back together, leaving them just a little bit better than they were before.\n\n\nISTPs prefer to approach problems directly, seeking straightforward solutions over convoluted troubleshooting methods. People with this personality type rely heavily on firsthand experience and trial and error as they execute their ideas and projects. And as they do so, they usually prefer to work at their own pace, on their own terms, and without unnecessary interruptions.\n\nThis is not a type who is inclined to socialize beyond what is necessary as they try to accomplish their goals. In fact, ISTP personalities generally find regular socializing to be taxing. And when they do decide to get together with people, they will almost always choose smaller, more meaningful interactions over superficial networking.");

		}else

		if(Arrays.equals(finalResult, new char[] {'I','S','F','P'})){
			System.out.println("ISFP");
			System.out.println("The Adventurer");
			System.out.println("WHO IS THE ISFP PERSONALITY TYPE?\n\nISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.\n\nI change during the course of a day. I wake and I’m one person, and when I go to sleep I know for certain I’m somebody else.\n\n\nBob Dylan\nPeople with the ISFP personality type (Adventurers) are true artists – although not necessarily in the conventional sense. For these types, life itself is a canvas for self-expression. From what they wear to how they spend their free time, they act in ways that vividly reflect who they are as unique individuals. With their exploratory spirit and their ability to find joy in everyday life, ISFPs can be among the most interesting people you’ll ever meet.\n\nDriven by their sense of fairness and their open-mindedness, people with this personality type move through life with an infectiously encouraging attitude. They love motivating those close to them to follow their passions and usually follow their own interests with the same unhindered enthusiasm. The only irony? Unassuming and humble, ISFPs tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.");

		}else

		if(Arrays.equals(finalResult, new char[] {'E','S','T','P'})){
			System.out.println("ESTP");
			System.out.println("The Entrepreneur");
			System.out.println("WHO IS THE ESTP PERSONALITY TYPE?\n\nESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.\n\nLife is either a daring adventure or nothing at all.\n\n\nHelen Keller\nPeople with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with an enthusiastic and spontaneous energy. They tend to be on the competitive side, often assuming that a competitive mindset is a necessity in order to achieve success in life. With their driven, action-oriented attitudes, they rarely waste time thinking about the past. In fact, they excel at keeping their attention rooted in their present – so much so that they rarely find themselves fixated on the time throughout the day.\nTheory, abstract concepts, and plodding discussions about global issues and their implications don’t keep ESTP personalities interested for long. They keep their conversations energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out and do it. They often leap before they look, fixing their mistakes as they go rather than sitting idle and preparing contingencies and escape clauses.");

		}else

		if(Arrays.equals(finalResult, new char[] {'E','S','F','P'})){
			System.out.println("ESFP");
			System.out.println("The Entertainer");
			System.out.println("WHO IS THE ESFP PERSONALITY TYPE?\n\nESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.\n\nLive for each second without hesitation.\n\n\nELTON JOHN\nIf anyone is to be found spontaneously breaking into song and dance, it is people with the ESFP personality type (Entertainers). They get caught up in the excitement of the moment and want everyone else to feel that way too. No other type is as generous with their time and energy when it comes to encouraging others, and no other type does it with such irresistible style.\n\n");

		} else {
			System.out.println("Personality type not recognized.");

		}

	}
}