package src;

public class ArrayCaseStudy {
    public static void main(String[] args) {
        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};
        
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int passedCount = 0;
        
        System.out.println("--- System Analysis Scores (Array) ---");
        
        // ประมวลผลข้อมูลผ่าน Loop
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] >= 7) {
                passedCount++;
            }
        }
        
        double average = (double) sum / scores.length;
        
        // แสดงผลลัพธ์พื้นฐาน
        System.out.println("Total Score: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Maximum Score: " + max);
        System.out.println("Minimum Score: " + min);
        System.out.println("Students with scores >= 7: " + passedCount + " students");
        
        // ค้นหาและแสดงรายชื่อนักศึกษาที่ต้องได้รับการทบทวน (คะแนน < 5)
        System.out.print("Students needing review (Score < 5): ");
        boolean first = true;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print("Student_" + (i + 1) + " (Score: " + scores[i] + ")");
                first = false;
            }
        }
        System.out.println("\n--------------------------------------");
    }
}