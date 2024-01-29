public class cwh_26_array {
    public static void main(String[] args) {
        //array declaration and memory allocation
//        int[] marks= new int[5];
//        marks[0]=199;
//        marks[1]=19;
//        marks[2]=15;
//        System.out.println(marks[3]);
        //array declaration and initialize
//        int [] marks={2,7,2,97};
//        System.out.println(marks[3]);
//        System.out.println(marks.length);
        String[] name={"nezam","Zonaid","Jahid"};
        for (int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
        // In reverse oder
        System.out.println("In reverse oder");
        for (int i=name.length-1;i>=0;i--){
            System.out.println(name[i]);
        }
        // Using for each loop
        System.out.println("Using for each loop");
        for(String element:name){
            System.out.println(element);
        }

    }
}
