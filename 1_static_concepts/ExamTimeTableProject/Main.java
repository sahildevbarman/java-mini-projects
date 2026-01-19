class Main{
    public static void main(String[] args) {
        System.out.println("BCA II Year Exam Time Tablen");
        System.out.println("__________________________________________________________________________________\n");

        for(Exam e : College.timeTable) {
            System.out.println(e.sno + "| " + e.date + "| " + e.time + "| " + e.subject);
        }
    }
}