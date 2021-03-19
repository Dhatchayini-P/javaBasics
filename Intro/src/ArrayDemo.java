public class ArrayDemo { //Single dimensional array
    void demo() {
        int a[] = new int[6];//declaration
        a[0] = 10;//initialization
        a[1] = 12;
        a[2] = 14;
        a[3] = 16;
        a[4] = 18;
        for (int i = 0; i < a.length; i++) { //i=0;0<6  i=1;1<6
            System.out.println(a[i]);
        }
    }
    void demo1(){
        int b[]={12,23,34,45,56,67};//declaration,initialization
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    /** for-each loop for java array(syntax)
     * for(data_type variable:array){
     * //body of the loop
     * }
     */
    void demo2(){ //for-each loop
        int arr[]={123,234,345,456};
        for(int i:arr){
            System.out.println(i);
        }
    }
    void demo3(){ //multidimensional array
        int arr[][]={{1,2,2},
                {1,3,3}
                };


        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void demo4(){ //Addition of 2 Matrices in Java
        int a[][]={{1,2,3},{3,2,1}};
        int b[][]={{1,2,3},{3,2,1}};
        int c[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
