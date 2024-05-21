public class ForEachLoop {
    public static void main(String[] args){
        String[] celebrities = {"Bruno Mars", "Taylor Swift", "Max Smith", "Eminem"};
        //For each loop
        //Loop on celebrities array
        for (String name:celebrities){
            System.out.print(name);
            System.out.print(",");
        }

        System.out.print("\n");
        //Integer array
        int[] age = {20, 22, 24, 43};
        for(int x:age){
            System.out.print(x);
            System.out.print(",");
        }
    }
}
