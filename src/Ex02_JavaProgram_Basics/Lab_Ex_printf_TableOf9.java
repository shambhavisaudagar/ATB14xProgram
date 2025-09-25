package Ex02_JavaProgram_Basics;

public class Lab_Ex_printf_TableOf9 {
    public static void main(String[] args) {
        int num=9;
        System.out.printf("9*%d = %d \n",1,num*1);
        System.out.printf("9*%d = %d \n",2,num*2);
        System.out.printf("9*%d = %d \n",3,num*3);
        System.out.printf("9*%d = %d \n",4,num*4);
        System.out.printf("9*%d = %d \n",5,num*5);
        System.out.printf("9*%d = %d \n",6,num*6);
        System.out.printf("9*%d = %d \n",7,num*7);
        System.out.printf("9*%d = %d \n",8,num*8);
        System.out.printf("9*%d = %d \n",9,num*9);
        System.out.printf("9*%d = %d \n",10,num*10).println();

        System.out.println("Pramod way - Table of 5");
        int num5 = 5;
        System.out.printf("%dx1=%d",num5,num5*1).println();
        System.out.printf("%dx2=%d",num5,num5*2).println();
        System.out.printf("%dx3=%d",num5,num5*3).println();
        System.out.printf("%dx4=%d",num5,num5*4).println();
        System.out.printf("%dx5=%d",num5,num5*5).println();
        System.out.printf("%dx6=%d",num5,num5*6).println();
        System.out.printf("%dx7=%d",num5,num5*7).println();
        System.out.printf("%dx8=%d",num5,num5*8).println();
        System.out.printf("%dx9=%d",num5,num5*9).println();
        System.out.printf("%dx10=%d",num5,num5*10).println();

/* Multiline comment
        System.out.println("With for loop");
        int i = 1;
        for(i=1; i <= 10 ;i++)
        {
            System.out.printf("9*%d = %d \n",i,i*num);
       }*/
    }// Single line comment
}
