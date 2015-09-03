package android.in.teachcoder.app.model;

import android.in.teachcoder.app.bedtimestories.MainActivity;
import android.in.teachcoder.app.bedtimestories.R;
import android.text.Html;

import java.util.ArrayList;
import java.util.List;


public class StoryArray {
    public List<Story> stories;


    public StoryArray() {
        this.stories = new ArrayList<>();


        //Story1
        stories.add(new Story(
                "The Secret of Happiness",

                Html.fromHtml("<p class=\"bodyText2\">Once upon a time, there were three brothers named Samuel, Timothy and Xander, who lived in a cottage by the woods. They were honest and hardworking. Every day, they would venture into the forest to fell wood. Later, they would sell it in the market where it would fetch a decent price. Thus, their life continued in this manner. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">However, the brothers were always sad and morose. Even though they lived a good life, they were unhappy. Each one hankered for something or the other and would pine for it. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">One day, while Samuel, Timothy and Xander were returning home from the woods carrying their bundle of logs, they saw an old haggard woman bent low with a sack on her back. As they were kind and compassionate, the brothers immediately approached the poor woman and offered to carry the sack all the way to her home. She smiled and expressed her gratefulness, while replying that the sack actually contained apples that she had collected in the forest. Samuel, Timothy and Xander took turns in carrying the sack, and at last, when they reached the woman’s home, they were very tired indeed. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Now, this old woman was no ordinary person and had magical powers. Pleased with the brothers’ kind and selfless nature, she asked them whether there was anything she could help them with, as a reward. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">“We are not happy, and that has become our greatest cause of concern,” replied Samuel. The woman asked what would make them happy. Each brother spoke of a different thing that would please him.<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">“A splendid mansion with plenty of servants would make me happy. There is nothing more that I would want,” said Samuel. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">“A big farm with lots of harvest would make me happy. Then I could be rich without having to worry,” said Timothy.<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">“A beautiful wife would make me happy. Every day, after returning home, her sweet little face would light me up and make me forget my sorrows,” said Xander. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">“That is fine,” said the old woman, “If these things will give you happiness, you deserve them in every respect for helping a poor helpless person like me. Go home, and each of you shall find exactly what you have wished for.”<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">This took the brothers by surprise as they did not know about the woman’s powers. Nevertheless, they took leave and returned home. But lo behold, beside their cottage, there was a huge mansion with a doorman and other servants waiting outside! They greeted Samuel and ushered him in. At some distance, a yellow farmland showed itself. A ploughman came and announced that it belonged to Timothy. Timothy gasped. Just at that moment, a beautiful maiden approached Xander and coyly said that she was his wife. The brothers were beside themselves with joy at this new turn of events. They thanked their lucky stars and adapted to their new lifestyles. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">The days passed and soon a year was over. The situation was however, now different for Samuel, Timothy and Xander. Samuel had grown tired of owning the mansion. He became lazy and did not supervise his servants into taking proper care of the mansion. Timothy, who had built a decent house next to his farmland, found it burdensome to plough the fields and sow seeds from time to time. Xander too, grew used to his beautiful wife and no longer found any joy in keeping her company. In short, all of them were unhappy again. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">One day, the three of them met up and decided to visit the old woman at her home. “That woman has magical powers which turned our dreams into reality. However, since we are no longer happy, we must go and seek her help now. It is she who will be able to tell us the secret to attaining happiness,” said Samuel. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">When they came to the old woman, she was cooking stew in a pot. Greeting her, each of the brothers recounted how he had turned unhappy again. “Please tell us how we can once more be happy,” said Timothy. <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">“Well,” replied the old woman. “It is all in your own hands. See, when each of you made his wish and it was granted, you were happy. However, happiness never lasts without a very important thing – content. Earlier, since you were happy but never really content or satisfied, boredom and misery overcame you and you became sad again. Only if you learn to be content, can you truly enjoy the bliss of happiness.”<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Samuel, Timothy and Xander realized their mistake and went back home. They saw how lucky they were to have the gifts for which they had once craved. Samuel felt grateful for being the owner of a mansion and began taking good care of it. Timothy began to plough his land diligently so as to have a good harvest in time. Xander too learnt to appreciate his pretty wife’s chores in the house and her devotion towards him. Remembering that happiness and content went side by side, never again did the brothers take their blessings for granted. And thus, they lived happily ever after.</p>\n" +
                        "<div class=\"gap\"></div>" +
                        "\"<p>&nbsp;</p>\\n\" +\n" +
                        "                            \"<p><strong>THE END</strong></p>"),
                R.drawable.tstory1,
                R.drawable.mstory1));//Story1 Ends



        //Story2
        stories.add(new Story(
                "Fox and a Crane"
                ,
                Html.fromHtml("<strong>Once a fox and a crane became friends. So, the fox invited the crane to dinner. The crane accepted the invitation and reached the fox's place at sunset.<br />\n" +
                        "<br />\n" +
                        "The fox had prepared soup for his mate. But as we all know that foxes are cunning by nature, he served the soup in flat dishes. So, he himself lapped the crane's share with his tongue enjoying its relish a lot. But the crane could not enjoy it at all with his long beak and had to get back home hungry. The shrewd fox felt extremely amused.<br />\n" +
                        "<br />\n" +
                        "After few days, the crane invited the fox to dine in with him. The fox reached his place well in time. The crane gave him a warm welcome and served the soup in a jug with a long and narrow neck.<br />\n" +
                        "<br />\n" +
                        "So, the crane enjoyed the soup with great relish using his long beak. The fox's mouth couldn't reach the soup through the narrow neck of the jug. He had to return home hungry. Now he realized that he had been repaid for his behaviour with the crane. </strong>\n" +
                        "<div align=\"center\"><h2><em>The End..</em></h2>"),
                R.drawable.tstory13,
                R.drawable.mstory13));//Story2 Ends

        //Story3
        stories.add(new Story(
                "Love and Time",
                Html.fromHtml("<p class=\"bodyText2\">Once upon a time, there was an island where all the feelings lived: Happiness, Sadness, Knowledge, and all of the others, including Love. One day it was announced to the feelings that the island would sink, so all constructed boats and left. Except for Love.</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Love was the only one who stayed. Love wanted to hold out until the last possible moment. When the island had almost sunk, Love decided to ask for help.</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Richness was passing by Love in a grand boat. Love said, “Richness, can you take me with you?”</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Richness answered, “No, I can’t. There is a lot of gold and silver in my boat. There is no place here for you.”</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Love decided to ask Vanity who was also passing by in a beautiful vessel. “Vanity, please help me!” “I can’t help you, Love. You are all wet and might damage my boat,” Vanity answered.</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Sadness was close by so Love asked, “Sadness, let me go with you.” “Oh . . . Love, I am so sad that I need to be by myself!” Happiness passed by Love, too, but she was so happy that she did not even hear when Love called her.</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">Suddenly, there was a voice, “Come, Love, I will take you.” It was an elder.<br />\n" +
                        "So blessed and overjoyed, Love even forgot to ask the elder where they were going. When they arrived at dry land, the elder went his own way. Realizing how much was owed the elder, Love asked Knowledge, another elder, “Who Helped me?”</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">“It was Time,” Knowledge answered.</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\"><strong>“Time?” asked Love. “But why did Time help me?” Knowledge smiled with deep wisdom and answered, “Because only Time is capable of understanding how valuable Love is.”</span></strong></p>\n" +
                        "</div>"),
                R.drawable.tstory14,
                R.drawable.mstory14));
                //Story3 Ends

            //Story4
            stories.add(new Story(
                    "Gold Coins and a Selfish Man",
                    Html.fromHtml("<p class=\"bodyText2\">Sam was a greedy and a selfish man. He always desired to have lots and lots of money and never hesitated to cheat others to make money. Also, he never wished to share anything with others. He was so selfish that he would like to own everything for himself. <br>\n" +
                            "<br>\n" +
                            "The selfish man used to calculate each and every small aspect. He paid very little amount of wages to his servants. Where ever he went, he calculated a lot to save money by deceiving others. He also told a lot of lies to protect his wealth. Simply, Sam was the antonym for the word; HONESTY. <br>\n" +
                            "<br>\n" +
                            "However, he was taught a nice lesson by his own act. <br>\n" +
                            "<br>\n" +
                            "One day, he missed a small bag, which contained 50 gold coins. He was searching for the bag of gold coins, day and night. He sent his workers in search of the bag, but none could find it. He told his friends and neighbors that he had lost a bag of gold coins and requested them to inform him, if they found it. Sam was so sad that he had lost so many gold coins. <br>\n" +
                            "<br>\n" +
                            "After a couple of days, a ten year old girl, who lived near Sam’s house, told her father that she had found a small bag and that it had 50 gold coins. Her father worked in Sam’s land and he told his daughter that the bag belonged to his master. He had lost it two days ago, and added that he would return the bag to his master. <br>\n" +
                            "<br>\n" +
                            "They weren’t very rich, and the father could have easily retained the gold coins, and hide the fact of finding the bag. He was so honest that he felt that he should return the valuable coins to his master, as he was the rightful owner. <br>\n" +
                            "<br>\n" +
                            "He gave the bag back to his master Sam, and asked him to check whether the bag had 50 gold coins. Sam who was literally happy to get the coins, decided to play a trick. He shouted at his worker, ‘there were 75 gold coins in this bag and you gave me only 50! Where are the other coins? You have stolen them!’<br>\n" +
                            "<br>\n" +
                            "The worker was shocked to hear this, and he pleaded to his master that he gave whatever his daughter had found. Selfish and greedy, Sam did not accept the worker’s story, and decided to take the issue to court. <br>\n" +
                            "<br>\n" +
                            "The judge heard both the sides. He questioned the daughter and the worker about the number of coins they had found in the bag, and they assured it was only 50.<br>\n" +
                            "<br>\n" +
                            "He cross-examined Sam and Sam replied, ‘Yes m’lord, I had 75 gold coins in my bag, and they gave me only 50. Hence, it is quite obvious that they have stolen the balance 25 coins!’<br>\n" +
                            "<br>\n" +
                            "Judge then asked, ‘Are you sure you that your bag had 75 coins?’ and Sam nodded his head in acceptance.<br>\n" +
                            "<br>\n" +
                            "The judge then made his judgment, ‘Since Sam lost a bag of 75 gold coins and the bag found by the girl had only 50 coins, it is obvious that the bag found, didn’t belong to Sam, and it was lost by someone else. In addition, if anyone found a bag of 75 gold coins, I will declare that it belongs to Sam. As there are no claims against the loss of 50 coins, I order the girl and his father to take those 50 coins as a token of appreciation for their honesty!’<br>\n" +
                            "<strong><br>\n" +
                            "Honesty will always be rewarded and greediness punished!</strong></p>"),
                    R.drawable.tstory15,
                    R.drawable.mstory15));//Story4 Ends

            //Story5
            stories.add(new Story(
                    "The Wolf and the Lamb",
                    Html.fromHtml("It was a little lamb, accompanied by a flock of sheep to a grazing land. As the flock was grazing the green grass, the little lamb, which was so mischievous, was wandering here and there. It saw fresh grass at a distance and separated from the crew to enjoy the fresh bites. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">It came across a long way from its group and was eating the fresh and delicious grass unaware of the fact that it was closely followed by a wolf! <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">When the lamb realized that it lost its way and was far away from the flock, it decided to join them. However, the lamb was stunned to see a hungry and cunning wolf standing behind it. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The lamb realized that there is no option left except to surrender itself to the wolf. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The lamb asked the wolf, ‘Are you going to eat me?’<br />\n" +
                            "The wolf said, ‘Yes, at any cost!’<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The lamb said again, ‘But can you please wait for some more time? I eat a lot of grass now and my stomach is filled with grass. If you eat me now, you will feel like eating grass!<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The wolf agreed, ‘Oh yes I will wait. You are here before me and I can wait for some time!’<br />\n" +
                            "The lamb thanked. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">After sometime, the wolf got ready to kill lamb, but the lamb stopped him. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">‘Dear wolf, please wait for some more time. The grass is yet to get digest. If you eat me now, you will see a lot of grass in my stomach! Let me dance and it will be digested easily.’<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Wolf agreed. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The little lamb danced crazily and carefully and moved the foot towards the group. Suddenly the lamb stopped dancing. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Wolf enquired what happen. ‘See, remove this bell tied to my neck and rang it as fast as you can, so that I will dance faster and the food will digest very sooner’<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The wolf, with the desire to eat the lamb removed the bell tied to the lamb’s neck and shaked it speedily. <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Meanwhile, shepherd was searching for the little lamb and heard the bell sound. He saw the wolf and the lamb. He ran towards wolf with a stick. Seeing the shepherd with a stick, the wolf ran away, and the lamb was saved! <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\"><strong>Physical strength isn’t just sufficient. Sometimes, weaker people with smart mind can overcome the physically strong ones! </strong></p>"),
                    R.drawable.tstory16,
                    R.drawable.mstory16));//Story5 Ends

            //Story6
            stories.add(new Story(
                    "A glass of milk",
                    Html.fromHtml("<p class=\"bodyText2\">There was a poor boy who made a living with selling various objects door to door, to pay for his school. He was very hungry and felt he couldn’t walk even a few steps. He decided to ask for food at a house. He knocked the door and was stunned to see a beautiful young girl at the door step. With so much hesitation, in spite of his hunger, he asked the girl to offer a glass of water.<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The young girl understood his hunger through his eyes and offered him milk in a huge glass. With astonished look he drank the milk very slowly. And asked how much I owe you for this milk?<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The girl replied ‘<em>I don’t accept anything for kindness.’</em>&nbsp;With big smile in his face, the boy thanked the girl from the bottom of his heart and left the place.<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Years passed by. The young girl fell ill and was diagnosed with the rarest kind of nervous condition, which was a complicated condition to treat. While many experienced doctors baffled at her condition, she was taken to a big hospital to study about her condition.<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Dr. Kevin, a renowned specialist was called in by the hospital to examine her. He gave a visit to the hospital where she was admitted to learn about the rare condition. As he entered her room, Dr. Kevin immediately identified who that woman was!<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">With all his efforts and knowledge, Dr.Kevin battled hardly with the disease for weeks and months. At last, he won over the disease and the woman was completely cured. Everyone praised the doctor, while the woman was quite afraid about the hospital bill as she could not afford to pay.<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Dr. Kevin asked the hospital to send the bill to him as he would add his charges. After receiving the hospital bill, he wrote a note and sent it to her. With lots of fear, she opened the bill and had no idea how much she was charged.<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Her eyes filled with tears and happiness once she opened the bill. She found the bill cancelled and that was not the reason for her happiness.</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<span class=\"bodyText2\">She saw the note written by Dr.Kevin - “<em>Bill Paid years ago with a glass of milk!</em>”</span>" +
                            "\"<p>&nbsp;</p>\\n <p><strong>THE END</strong></p>"),
                    R.drawable.tstory17,
                    R.drawable.mstory17));//Story6 Ends

            //Story7
            stories.add(new Story(
                    "The Emperor's New Clothes",

                    Html.fromHtml("Once upon a time there was an <strong>emperor that spent all his money on expensive clothes.</strong> He cared nothing about other activities like going to the theatre, or going for a ride in his carriage, except to show off his new clothes. He <strong>didn´t even care about talking to people.</strong></p>\n" +
                            "<p>In the great city where he lived, there were lots of tourists. One day <strong>two swindlers</strong> arrived and let it be known that they <strong>were weavers</strong> and they said they could <strong>make the emperor the most magnificent suit from a special fabric</strong>. Not only were their colours and patterns uncommonly fine, <strong>but clothes made from this cloth were only visible to clever people</strong>.</p>\n" +
                            "<p>&#8220;I would then be able to <strong>discover</strong> which men in my empire are unfit for their posts&#8221; &#8211; thought the Emperor &#8211; &#8220;and I could tell the wise men from the fools&#8221;.</p>\n" +
                            "<p>They <strong>set up two looms and pretended to weave.</strong> There was nothing on the looms, as all the finest silk and expensive fabrics went into their bags, whilst their worked their empty looms far into the night.</p>\n" +
                            "<p>The Emperor sent his <strong>old minister</strong> to the weavers: &#8220;He will be the best person to tell me how the material looks&#8221; &#8211; thought the Emperor.</p>\n" +
                            "<p>The old minister went into the room where the two swindlers were sitting working away at their empty looms. The old minister couldn&#8217;t<strong> see anything,</strong> but he didn&#8217;t say so in case they though he was <strong>stupid.</strong></p>\n" +
                            "<p>&#8220;Tell us what you think of it?&#8221; &#8211; asked one of the weavers.</p>\n" +
                            "<p>&#8220;Oh! It´s <strong>beautiful</strong>, such a pattern, what colours! I&#8217;ll tell the Emperor how <strong>delighted</strong> I am with it&#8221;. &#8211; said the old minister.</p>\n" +
                            "<p>All the <strong>town were talking about the Emperor´s splendid cloth</strong>, until he wanted to see it for himself. So he set out to see the two swindlers. He found them weaving with might and main, but without a thread on their looms. &#8220;Oh!, it´s <strong>very pretty</strong>&#8221; &#8211; said the Emperor so as not to <strong>look a fool</strong> &#8211; &#8220;It has my highest approval&#8221;. Nothing would make him say that he couldn´t see a thing.</p>\n" +
                            "<p>His whole retinue stared and stared. One saw no more than another, but they all joined with the Emperor in exclaiming, &#8220;Oh! It&#8217;s <em>very</em> pretty,&#8221; and they advised him to wear the clothes made of this wonderful cloth <strong>for the great procession</strong> he was soon to lead.</p>\n" +
                            "<p>The day of the procession arrived and the emperor went to <strong>put on his new wonderful suit.</strong></p>\n" +
                            "<p>The Emperor led the procession in his splendid new clothes. Everyone in the streets and at the windows said, &#8220;Oh, how fine are the Emperor&#8217;s new clothes! Don&#8217;t they fit him to perfection? And see his long train!&#8221; <strong>None would confess that they couldn&#8217;t see anything</strong>, for that would prove him to be either unfit for his position, or a fool.</p>\n" +
                            "<p>Suddenly a<strong> child</strong> said: &#8220;But he hasn´t got <strong>anything on!</strong>&#8221; Then one person whispered to another what the child had said until the whole town said: &#8220;He hasn´t got anything on.&#8221;</p>\n" +
                            "<p>The Emperor suspected they were right, but continued to lead the procession <strong>walking more proudly than ever</strong> under the illusion that anyone who couldn´t see his clothes was fool, as his noblemen <strong>held high his imaginary mantle.</strong></p>\n" +
                            "<p>&nbsp;</p>\n" +
                            "<p><strong>THE END</strong></p>"),
                    R.drawable.tstory7,
                    R.drawable.mstory7));//Story7 Ends

//            //Story8
            stories.add(new Story(
                    "King Midas",

                    Html.fromHtml("<p>This is the story of a King who was really <strong>greedy</strong> and, as we all know, <strong>greed over-reaches itself;</strong> one may end up with nothing.</p>\n" +
                            "<p><strong>King Midas</strong> lived in a big palace beside a river. He was<strong> very rich</strong>, and had a lot of money and luxury. But he wanted more &#8211; “I want to be richer!”- he would say.</p>\n" +
                            "<p>One day he found a magic lamp and a <strong>magician</strong> appeared. &#8211; “I want to have more treasure than I already have.”- Said King Midas. The magician thought that it was an opportunity to <strong>teach him a lesson</strong> and said, – “Your majesty, I can give you a power that will make you the richest man in the world, anything that you touch will turn into gold”.\n" +
                            "<p>The king was delighted with his gold fortune, everything he touched<strong> turned into gold</strong>, and he turned cutlery, tables, chairs and flowers into gold. But when he sat down for dinner, he also turned his food into gold.</p>\n" +
                            "<p>Then King Midas went to visit his<strong> daughter</strong> and the moment he hugged her, she turned into a<strong> gold statue</strong>. Desperate he went to ask the magician what was going on. &#8211; “I wanted you to realise that being rich is not important, you have to pay attention to<strong> the important things, like your family</strong>”, said the magician.</p>\n" +
                            "<p>And King Midas learnt his lesson, and the magician changed everything back to normal. King Midas was<strong> never greedy again</strong> and lived happily with his family to the end of his days.</p>\n" +
                            "<p><strong>THE END</strong></p>"),
                    R.drawable.tstory8,
                    R.drawable.mstory8));//Story8 Ends

            //Story9
            stories.add(new Story(
                    "True Wealth",
                    Html.fromHtml("<p class=\"bodyText2\">Once upon a time, there lived a very rich and wealthy man in a big town. He had all sorts of wealth and led a luxurious life. He had every luxury at his footstep and could afford to feed for the entire people of his town. He always boasted his luxurious life to his friends and relatives.&nbsp; <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">His son was studying in a distant place and he returned home for vacation. The rich man wanted to show off to his son how rich his father was and how he made him very proud. But his son wasn’t ever fond of any luxurious lifestyle. However, the rich man wanted to make his son realize that his lifestyle was extremely rich and how the poor people did suffer. He planned for a day visit to the entire town to show him off the life of the poor people.&nbsp; <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The father and the son took a chariot and visited the entire town. They returned home after two days. The father was happy that his son was very quiet after seeing the poor people honouring the rich man and after seeing the sufferings of the poor ones due to lack of facilities.&nbsp; <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The rich man asked his son, ‘Dear boy, how was the trip? Have you enjoyed it?’<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">‘Yes my dad, it was a great trip with you.’ The son replied.&nbsp; <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">So, what did you learn from the trip? – The Father asked.<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The son was silent.&nbsp; <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Finally you have realized how the poor suffer and how they actually are – said the father.&nbsp; <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">No father – replied the son.&nbsp; <br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">He added, ‘We have only two dogs, they have 10 dogs. We have a big pool in our garden, but they have a massive bay without any ends! We have luxurious and expensive lights imported from various countries, but they have countless stars lighting their nights. We have a house in a small piece of land, but they have abundant fields that go beyond the sight. We are served by servants, but they serve people. We are protected by huge and strong walls around our property, but they bond with each other and surround themselves. We only buy food from them, but they are so rich to cultivate their own food.’<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">The rich father was stunned to hear his son’s words and he was completely speechless.&nbsp;<br />\n" +
                            "</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<p class=\"bodyText2\">Finally the son added, ‘Dad thank you so much for showing me who is rich and who is poor and let me understand how poor we are!’</p>\n" +
                            "<div class=\"gap\"></div>\n" +
                            "<span class=\"bodyText2\"><strong>True wealth is not measured by money and property we have! It is in the friendship, relationship and good compassion we share with the others.</strong></span> </div>"),
                    R.drawable.tstory9,
                    R.drawable.mstory9));//Story9 Ends

            //Story10
            stories.add(new Story(
                    "Golden Eggs",
                    Html.fromHtml("<strong>Once upon a time there lived a cloth merchant in a village with his wife and two children. They were indeed quite well-off. They had a beautiful hen which laid an egg everyday. It was not an ordinary egg, rather, a golden egg. But the man was not satisfied with what he used to get daily. He was a get rich-trice kind of a person.<br />\n" +
                            "<br />\n" +
                            "The man wanted to get all the golden eggs from his hen at one single go. So, one day he thought hard and at last clicked upon a plan. He decided to kill the hen and get all the eggs together.<br />\n" +
                            "<br />\n" +
                            "So, the next day when the hen laid a golden egg, the man caught hold of it, took a sharp knife, chopped off its neck and cut its body open. <br />\n" +
                            "<br />\n" +
                            "There was nothing but blood all around & no trace of any egg at all. He was highly grieved because now he would not get even one single egg.<br />\n" +
                            "<br />\n" +
                            "His life was going on smoothly with one egg a day but now, he himself made his life miserable. The outcome of his greed was that he started becoming poorer & poorer day by day and ultimately became a pauper. How jinxed and how much foolish he was. <br />\n" +
                            "<br />\n" +
                            "So, the moral of the story is- one who desires more, looses all. One should remain satisfied with what one gets. </strong>\n" +
                            "<div align=\"center\"><h2><em>The End..</em></h2>"),
                    R.drawable.tstory10,
                    R.drawable.mstory10));//Story10 Ends

            //Story11
            stories.add(new Story(
                    "Dove and The Bee",
                    Html.fromHtml("<strong>Once a swarm of bees had put up their hive in a tree that stood on the bank of a river. They remained busy collecting honey all the day. One day a bee felt thirsty and went to the river. As it tried to drink water, the water carried it away. So, it was about to drown.<br />\n" +
                            "<br />\n" +
                            "Fortunately, a dove was sitting on the branch of a tree.<br />\n" +
                            "<br />\n" +
                            "She saw the bee in trouble and immediately went for it's rescue. She plucked a broad leaf from the tree, flew to the bee and dropped the leaf near it. The bee mounted the leaf, dried it's wings and flew away to safety.<br />\n" +
                            "<br />\n" +
                            "After few days, the dove was caught in a big danger. She was sitting on the branch of a tree when an archer aimed at it. She thought of flying away but a hawk was hovering above her head. She could see her death nearby.<br />\n" +
                            "<br />\n" +
                            "Luckily, the bee came there. Seeing the dove in danger, it stung him. The arrow went off but missed it's aim and hit the hawk instead and killed it. Thus, the dove was saved from death. </strong>\n" +
                            "<div align=\"center\"><h2><em>The End..</em></h2>"),
                    R.drawable.tstory11,
                    R.drawable.mstory11));//Story11 Ends

            //Story12
            stories.add(new Story(
                    "Donkey and the merchant",
                    Html.fromHtml("<p class=\"pageName\"><span class=\"pageName\"> </span><span class=\"bodyText2\">One beautiful spring morning, a merchant loaded his donkey with bags of salt to go to the market in order to sell them. The merchant and his donkey were walking along together. They had not walked far when they reached a river on the road.</span></p>\n" +
                            "<br>\n" +
                            "<p class=\"bodyText2\">Unfortunately, the donkey slipped and fell into the river and noticed that the bags of salt loaded on his back became lighter.</p>\n" +
                            "<br>\n" +
                            "<p class=\"bodyText2\">There was nothing the merchant could do, except return home where he loaded his donkey with more bags of salt. As they reached the slippery riverbank, now deliberately, the donkey fell into the river and wasted all the bags of salt on its back again.</p>\n" +
                            "<br>\n" +
                            "<p class=\"bodyText2\">The merchant quickly discovered the donkey’s trick. He then returned home again but re-loaded his donkey with bags of sponges.</p>\n" +
                            "<br>\n" +
                            "<p class=\"bodyText2\">The foolish, tricky donkey again set on its way. On reaching the river he again fell into the water. But instead of the load becoming lighter, it became heavier.</p>\n" +
                            "<br>\n" +
                            "<p class=\"bodyText2\"><strong>The merchant laughed at him and said: “You foolish donkey, your trick had been discovered, you should know that, those who are too clever sometimes over reach themselves.”</strong></p>\n" +
                            "</div>"),
                    R.drawable.tstory26,
                    R.drawable.mstory26));//Story12 Ends

        //Story13
        stories.add(new Story(
                "Foolish Monkeys",
                Html.fromHtml("<p class=\"bodyText2\">Before several centuries, there was a very large, dense and dark forest. A group of monkeys arrived at the forest. It was winter season, and the monkeys struggled hard to survive the freezing cold nights. They were hunting for fire to get warm.&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">One night, they saw a firefly and considered it a dab of fire. All the monkeys in the group shouted ‘Fire, Fire, Fire, Yeah we got fire!’&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">A couple of monkeys tried to catch the firefly and it escaped. They were sad as they could not catch the fire. They were talking to themselves that they couldn’t live in the cold if they didn’t get the fire.&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">The next night, again they saw many fireflies. After several attempts, the monkeys caught a few fireflies. They put the fireflies in a hole dug in the land and tried to blow the flies.&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">They blew the flies very hard without knowing the fact that they were flies!&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">An owl was watching the activities of the monkeys. The owl reached the monkeys and told them, ‘Hey those are not fire! They are flies. You won’t be able to make fire from it!’<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">The monkeys laughed at the owl. One monkey replied the owl, ‘Hey old owl you don’t know anything about how to make fire. Don’t disturb us!’<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">The Owl warned the monkeys again and asked them to stop their foolish act. ‘Monkeys, you cannot make fire from the flies! Please hear my words.’<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">The monkeys tried to make fire from the flies.&nbsp;<br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">The Owl told them again to stop their foolish act. ‘You are struggling so much, go take your shelter in a nearby cave. You can save yourself from the freezing cold! You won’t get fire!’&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">One monkey shouted at the owl and the owl left the place.&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">The monkeys were simply doing the foolish activity for several hours and it was almost midnight. They were very tired and realized that the words of the owl were correct and they were trying to blow a fly.&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\">They sheltered themselves at the cave and escaped from the cold.&nbsp; <br />\n" +
                        "</p>\n" +
                        "<div class=\"gap\"></div>\n" +
                        "<p class=\"bodyText2\"><strong>We may go wrong many times and should seek and accept the advice / suggestions provided by others.</strong> </p>"),
                R.drawable.tstory20,
                R.drawable.mstory20));//Story13 Ends

        //Story14
        stories.add(new Story(
                "Thumbelina",
                Html.fromHtml("<p>A long time ago and far, far away an old woman was sitting in her rocking chair thinking how happy she would be if she had a child. Then, she heard a knock at the door and opened it. A lady was standing there and she said, \"If you let me in, I will grant you a wish.\" The old woman let the woman in firstly because she felt pity, secondly because she knew what she'd wish for...a child. After she washed the lady up and fed her, she saw that she was really beautiful.</p><p>The lady slept soundly all night long and then right before she left, she said, \"Now, about your wish. What do you want?\"</p><p>The lady thought about most people's wishes to be richest in the world, most powerful person, the smartest, and the prettiest. But the old woman wished for <br/> something the lady could not believe. She said, \"I would like a child.\"</p><p>\"What did you say?\" she asked because she was astonished at what the old lady asked for. The old lady repeated what she said. \"I would like a child.\"</p><p>The lady then placed a tiny seed in the old woman's hand and gave her instructions. \" Plant this seed, water it carefully, watch over it, and give it your love. If you do all those things, then you will have a child.\"</p><p>So the old woman did all of those things the lady had told her to. In a week, there was a beautiful yellow flower in place of the seed. The next day, the flower bloomed. Inside the flower was a beautiful little girl who was the size of the woman's thumb so she a called her Thumbellina. She made her a little dress out of golden threads. Thumbellina slept in a walnut shell and brought the old woman joy and happiness.</p><p>But, one day when Thumbellina went down for her nap, a frog hopped through the open window and said, \"You will be a perfect bride for my son,\" and she took Thumbellina to a lily pad and hopped off to find her son.</p><p>Thumbellina cried and some little guppies heard her and chewed the roots off the lily pad to help her escape. Thumbellina's lily pad floated away. A few hours later, she finally stopped floating. During the summer, she ate berries and drank the dew off the leaves. But then winter came and she needed shelter. A kindly mouse let her stay with it, but it said, \"You'll have to marry my friend, Mole, because I cannot keep you for another winter.\"</p><p>The next day she went to see Mole. In one of tunnels, she found a sick bird and said, \"Poor thing, I will bury it.\" Then she found out that it was still alive and she cared for it until was ready to fly. It flew off. That fall she nearly had to marry Mole. But then she heard a familiar tweet and an idea popped up in the bird's head.</p><p>\"You can come down to the warm country,\" said the bird, so Thumbellina hopped on the bird's back and flew to the warm country. The people there who were like her renamed her Erin. She married a prince and she lived happily ever after.</p><p></p><center>The End</center>"),
                R.drawable.tstory21,
                R.drawable.mstory21));//Story14 Ends

        //Story15
        stories.add(new Story(
                "The Princess and the Pea",
                Html.fromHtml("<p>ONCE upon a time there was a prince who wanted to marry a princess; but she would have to be a real princess. He travelled all over the world to find one, but nowhere could he get what he wanted. There were princesses enough, but it was difficult to find out whether they were real ones. There was always something about them that was not as it should be. So he came home again and was sad, for he would have liked very much to have a real princess.</p><p>One evening a terrible storm came on; there was " +
                        "thunder and lightning, and the rain poured down in torrents. Suddenly a knocking was heard at the city gate, and the old king went to open it.</p><p>It was a princess standing out there in front of the gate. But, good gracious! what a sight the rain and the wind had made her look. The water ran down from her hair and clothes; it ran down into the toes of her shoes and out again at the heels. And yet she said that she was a real princess.</p><p>Well, we'll soon find that out, thought the old queen. But she said nothing, went into the bed-room, took all the bedding off the bedstead, and laid a pea on the bottom; then she took twenty mattresses and laid them on the pea, and then twenty eider-down beds on top of the mattresses.</p><p>On this the princess had to lie all night. In the morning she was " +
                        "asked how she had slept.</p><p>Oh, very badly! said she. I have scarcely closed my eyes all night. Heaven only knows what was in the bed, but I was lying on something hard, so that I am black and blue all over my body. Its horrible!</p><p>Now they knew that she was a real princess because she had felt the pea right through the twenty mattresses and the twenty eider-down beds.</p><p>Nobody but a real princess could be as sensitive as that.</p><p>So the prince took her for his wife, for now he knew " +
                        "that he had a real princess; and the pea was put in the museum, where it may still be seen, if no one has stolen it.</p><p>There, that is a true story.</p>"),
                R.drawable.tstory22,
                R.drawable.mstory22));//Story15 Ends

        //Story16
        stories.add(new Story(
                "The Three Little Pigs",
                Html.fromHtml("<p>Once upon a time there were three little pigs. One pig built a house of straw while the second pig built his house with sticks. They built their houses very quickly and then sang and danced all day because they were lazy. The third little pig worked hard all day and built his house with bricks.</p><p>A big bad wolf saw the two little pigs while they danced and played and thought, “What juicy tender meals they will make!” He chased the two pigs and they ran and hid in their houses. The big bad wolf went to the first house and huffed and puffed and blew the house down in minutes. The frightened little pig ran to the second pig’s house that was made of sticks. The big bad wolf now came to this house and huffed and puffed and blew the house down in hardly any time. Now, the two little pigs were terrified and ran to the third pig’s house that was made of bricks.</p><p>The big bad wolf tried to huff and puff and blow the house down, but he could not. He kept trying for hours but the house was very strong and the little pigs were safe inside. He tried to enter through the chimney but the third little pig boiled a big pot of water and kept it below the chimney. The wolf fell into it and died.</p><p>The two little pigs now felt sorry for having been so lazy. They too built their houses with bricks and lived happily ever after.</p>"),
                R.drawable.tstory23,
                R.drawable.mstory23));//Story16 Ends

        //Story17
        stories.add(new Story(
                "The bug and the flea",
                Html.fromHtml("</div>Mandavisarpini was a white flea. She lived in the folds of the exquisite white silk sheet that covered the bed of a king in a certain country.\n" +
                        "<br>&nbsp;<br>\n" +
                        "She fed on the king's blood without anybody noticing, and was happy to spend her days.\n" +
                        "<br>&nbsp;<br>\n" +
                        "One day, a bug managed to enter the beautifully decorated bedroom of the king.\n" +
                        "<br>&nbsp;<br>\n" +
                        "When the flea saw him, she warned, \"O Bug, what are you doing in the king's bedroom. Leave at once before you get caught!\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "The bug replied, \"Madam, even if I were a good-for-nothing bug, that is no way to treat a guest. One should welcome a guest with humble words, sweet behaviour and offer refreshments\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "The bug continued, \"I have fed myself with all types of blood, but never have I had the pleasure of the blood of a king. It must be very sweet, for the king eats the choicest of food. I would love to taste the king's blood, if you permit.\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "The flea was taken aback, \"O Bug, you have a nasty bite, like a sharp needle. Besides, I feed on the king's blood only when he is deep into his sleep. I can permit you to feed on the king's blood only if you promise to wait till he is asleep.\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "The bug agreed, \"I promise to wait till the king is asleep, and only after you have fed yourself, will I feed myself on his blood.\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "Soon after they decided on such terms, the king came to his bedroom and lay down to sleep.\n" +
                        "<br>&nbsp;<br>\n" +
                        "The bug could not control himself, and decided to take a tiny bite of the king, without waiting. As the king was yet to fall asleep, he jumped at the sharp bite of the bug.\n" +
                        "<br>&nbsp;<br>\n" +
                        "The king shouted at his servants, \"Hey, there is something in my bed that has bitten me. Look for it, as I have already been bitten.\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "On hearing this, the bug quickly hid himself in a corner of the bed, before the servants could start searching for him.\n" +
                        "<br>&nbsp;<br>\n" +
                        "However, the servants scrutinized the entire bed, sheet by sheet, and found the flea between the folds. They killed her at once, and the king went to sleep without anymore worries.\n" +
                        "<br>&nbsp;<br>The wise indeed say:<br><b><i>The false promises of friends as well as strangers have no value. You end up paying for it.</i></b>"),
                R.drawable.tstory25,
                R.drawable.mstory25));//Story17 Ends

        //Story18
        stories.add(new Story(
                "The Musical Donkey",
                Html.fromHtml("</div>There lived a washerman's donkey, whose name was Uddhata.\n" +
                        "<br>&nbsp;<br>\n" +
                        "During the day, the donkey would carry the washerman's bags, but during the night, he was set free to eat the green grass in a nearby field.\n" +
                        "<br>&nbsp;<br>\n" +
                        "However, instead of grazing in the nearby fields, he crept into nearby farms and ate vegetables of his choice. Before day-break it would come back to the washerman's house.\n" +
                        "<br>&nbsp;<br>\n" +
                        "One night, the donkey met a jackal while wandering in a nearby farm. They became good friends, and started meeting every night.\n" +
                        "<br>&nbsp;<br>\n" +
                        "The donkey, being fat, was able to break the fences of the farms. While he ate on the vegetable, the jackal would enter through the broken fence and ate the poultry on the farm. Before day-break, they would return to their respective home to meet again next night. This continued for many days.\n" +
                        "<br>&nbsp;<br>\n" +
                        "One night, the donkey said to the jackal, \"Nephew, I feel like singing on nights like tonight, when the moon is full and beautiful. What <i>Raaga</i> (note combination) shall I sing?\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "The jackal cautioned, \"Uncle, we are here to steal. Thieves should keep as quiet as possible. I may add, your voice is not as pleasant as you think, and sounds like conch being blown! Your voice can be heard over a long distance. It will awaken the farmers who are sleeping, and you will have us caught.\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "The jackal assured, \"Please uncle, eat as much as you like, and forget about singing!\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "This annoyed the donkey and he said, \"Dear nephew, it is because you are a wild animal that you don't appreciate music. I shall sing a melodious <i>Raaga</i>. Wait till you hear it!\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "Observing that the donkey was determined to sing; the jackal did not risk staying there anymore. He said, \"Uncle, if you must sing, please wait till I go outside the fence and keep a watch on the farmers.\"\n" +
                        "<br>&nbsp;<br>\n" +
                        "He ran outside the fence, and hid himself. Then, the donkey started to bray at the top of his voice.\n" +
                        "<br>&nbsp;<br>\n" +
                        "When the farmers heard the donkey braying, they could see easily in the fullmoon-lit farm that the donkey was in their farm.\n" +
                        "<br>&nbsp;<br>\n" +
                        "The angry farmers chased the donkey with sticks, and beat him so hard that he fell on the ground. Then, they tied a wooden mortar around his neck and let him go.\n" +
                        "<br>&nbsp;<br>\n" +
                        "When the donkey was returning through the broken fence, the jackal laughed, \"Musical uncle! That was a great <i>Raaga</i>! I see the farmers have rewarded you with this necklace!\"\n" +
                        "<br>&nbsp;<br>The wise indeed say:<br><b><i>There is always a proper place and time for doing anything.</i></b>" +
                        ""),
                R.drawable.tstory26,
                R.drawable.mstory26));//Story18 Ends
    }
}