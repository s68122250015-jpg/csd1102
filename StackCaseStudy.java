package src;

import java.util.Stack;

public class StackCaseStudy {
    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();
        
        // 1. เพิ่มคำสั่งลงใน Stack
        undoStack.push("Type Data");
        undoStack.push("Type Structure");
        undoStack.push("Delete Structure");
        undoStack.push("Type Algorithm");
        undoStack.push("Type Java");
        
        System.out.println("--- Undo System Simulation (Stack) ---");
        
        // 2. แสดงคำสั่งทั้งหมดใน Stack
        System.out.println("Current Stack Actions: " + undoStack);
        
        // 3. & 4. Undo คำสั่งล่าสุด 2 ครั้ง และแสดงคำสั่งที่ถูก Undo
        System.out.println("\nPerforming Undo Operations:");
        for (int i = 1; i <= 2; i++) {
            if (!undoStack.isEmpty()) { // 6. ตรวจสอบก่อน pop() ว่า Stack ว่างหรือไม่
                String undoneAction = undoStack.pop();
                System.out.println("Undo " + i + ": Undone action -> '" + undoneAction + "'");
            } else {
                System.out.println("Stack is empty. Cannot undo.");
            }
        }
        
        // 5. แสดงสถานะของ Stack หลังจาก Undo
        System.out.println("\nFinal Stack Status: " + undoStack);
        
        // 7. อธิบายหลักการ LIFO
        System.out.println("\n[LIFO Explanation]");
        System.out.println("Stack works on Last-In, First-Out (LIFO) principle.");
        System.out.println("The last command entered ('Type Java') was the first one removed during Undo.");
        System.out.println("--------------------------------------");
    }
}