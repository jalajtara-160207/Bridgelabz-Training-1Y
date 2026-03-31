package MultiThreading;
import java.text.SimpleDateFormat;
import java.util.Date;
public class UniversityHallManagement {
    static class ExamActivity implements Runnable {
        private final String activityName;
        private final int delaySeconds;
        private final int priority;
        private final int cycles;
        public ExamActivity(String activityName, int delaySeconds, int priority, int cycles)
        {
            this.activityName = activityName;
            this.delaySeconds = delaySeconds;
            this.priority = priority;
            this.cycles = cycles;
        }
        @Override
        public void run()
        {
            Thread.currentThread().setPriority(priority);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            try
            {
                if (delaySeconds > 0)
                {
                    Thread.sleep(delaySeconds * 1000);
                }
                for (int i = 1; i <= cycles; i++)
                {
                    String timestamp = sdf.format(new Date());
                    System.out.println(activityName + " cycle " + i + " at " + timestamp);
                    Thread.sleep(2000); // simulate work interval
                }
                System.out.println(activityName + " completed all cycles.");
            }
            catch (InterruptedException e)
            {
                System.out.println(activityName + " interrupted.");
                Thread.currentThread().interrupt();
            }
        }
    }

        public static void main(String[] args) {
            // Create threads for each activity
            Thread studentEntry = new Thread(new ExamActivity("Student Entry Monitoring", 0, 5, 5));
            Thread questionPaper = new Thread(new ExamActivity("Question Paper Distribution", 5, 10, 3));
            Thread attendance = new Thread(new ExamActivity("Attendance Marking", 10, 8, 3));
            Thread answerCollection = new Thread(new ExamActivity("Answer Sheet Collection", 20, 7, 3));

            System.out.println("Initial States:");
            System.out.println("Student Entry: " + studentEntry.getState());
            System.out.println("Question Paper: " + questionPaper.getState());
            System.out.println("Attendance: " + attendance.getState());
            System.out.println("Answer Collection: " + answerCollection.getState());
            studentEntry.start();
            questionPaper.start();
            attendance.start();
            answerCollection.start();
            try
            {
                while (studentEntry.isAlive() || questionPaper.isAlive() ||
                        attendance.isAlive() || answerCollection.isAlive()) {
                    System.out.println("States -> Entry: " + studentEntry.getState() +
                            ", QuestionPaper: " + questionPaper.getState() +
                            ", Attendance: " + attendance.getState() +
                            ", Collection: " + answerCollection.getState());
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e)
            {
                System.out.println("Main thread interrupted.");
            }
            System.out.println("Final States:");
            System.out.println("Student Entry: " + studentEntry.getState());
            System.out.println("Question Paper: " + questionPaper.getState());
            System.out.println("Attendance: " + attendance.getState());
            System.out.println("Answer Collection: " + answerCollection.getState());

            System.out.println("Exam Hall Monitoring completed successfully.");
        }
    }