import java.util.Scanner;

public class QuizService {
    int nums[] = new int[5]; // array of 5 integer
    Question questions[] = new Question[5]; // array of References
    int score =0;

    public QuizService() {

        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");

    }
    public void playQuiz()
    {
       /* for (int i=0; i< questions.length; i++)
        {
            System.out.println(questions[i].getTitle());
        } */
        int i=0;
        for (Question q :questions)
        {
            System.out.print("Question no " +(++i)+":");
            System.out.println(q.getTitle()+"?");
            System.out.println("option1 :"+q.getOption1());
            System.out.println("option2 :"+q.getOption2());
            System.out.println("option3 :"+q.getOption3());
            System.out.println("option4 :"+q.getOption4());

            Scanner scan = new Scanner(System.in);
            String ans=scan.nextLine();
            if( q.getAnswer().equals(ans))
            {
                score=score+1;
                System.out.println("You are Right ,Score is:"+score);

            }
            else
            {
                score= score-1;
                System.out.println("You are wrong,Score is:"+score);

            }


        }
        System.out.println("Your Score is:"+score);
    }

}
