package src;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {
    public static void main(String[] args) {
        Queue<String> clinicQueue = new LinkedList<>();
        
        System.out.println("--- Clinic Queue System Simulation (Queue) ---");
        
        // 1. เพิ่มผู้ป่วย P001 ถึง P005 ลงใน Queue
        clinicQueue.add("P001");
        clinicQueue.add("P002");
        clinicQueue.add("P003");
        clinicQueue.add("P004");
        clinicQueue.add("P005");
        System.out.println("Initial Queue (P001 - P005): " + clinicQueue);
        
        // 2. เรียกผู้ป่วยออกจากคิว 2 คน
        System.out.println("\nCalling patients for service:");
        for (int i = 1; i <= 2; i++) {
            if (!clinicQueue.isEmpty()) { // 7. ตรวจสอบก่อน remove() ว่า Queue ว่างหรือไม่
                String servedPatient = clinicQueue.remove();
                System.out.println("Served: " + servedPatient);
            } else {
                System.out.println("Queue is empty. No patient to serve.");
            }
        }
        
        // 3. เพิ่มผู้ป่วยใหม่ P006 และ P007
        clinicQueue.add("P006");
        clinicQueue.add("P007");
        System.out.println("\nAdded new patients (P006, P007)...");
        
        // 4. แสดงผู้ป่วยคนถัดไปด้วย peek()
        if (!clinicQueue.isEmpty()) {
            System.out.println("Next patient in line (peek): " + clinicQueue.peek());
        }
        
        // 5. แสดงจำนวนผู้ป่วยที่ยังรออยู่ด้วย size()
        System.out.println("Number of patients waiting (size): " + clinicQueue.size());
        
        // 6. แสดงสถานะของ Queue หลังจากดำเนินการทั้งหมด
        System.out.println("Final Queue Status: " + clinicQueue);
        
        // 8. อธิบายหลักการ FIFO
        System.out.println("\n[FIFO Explanation]");
        System.out.println("Queue works on First-In, First-Out (FIFO) principle.");
        System.out.println("Patients who arrived first (P001, P002) were served first, ensuring fairness.");
        System.out.println("----------------------------------------------");
    }
}