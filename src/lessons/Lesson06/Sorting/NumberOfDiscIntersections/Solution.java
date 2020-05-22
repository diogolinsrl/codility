package lessons.Lesson06.Sorting.NumberOfDiscIntersections;

class Solution {
    public int solution(int[] A) {
        
        int inter = 0;
        
        for (int i = 0;i < A.length && inter <= 10_000_000;i++) {

            long inicioI = i - (long)A[i];
            long fimI = i + (long)A[i];
            for (int j = i + 1;j < A.length && inter <= 10_000_000;j++) {
                long inicioJ = j - (long)A[j];
                long fimJ = j + (long)A[j];
                
                //System.out.print("i="+i+ ","+A[i]+"  j="+j+ ","+A[j]);
                //System.out.println();
                //System.out.println(inicioI);
                //System.out.println(fimI);
                //System.out.println(inicioJ);
                //System.out.println(fimJ);
                if (fimI < inicioJ || inicioJ > fimI) {
                    //System.out.println("Nao");
                } else {
                    inter++;
                    //System.out.println("Sim");
                }
            }
        }
        
        if (inter > 10_000_000) {
            inter = -1;
        }
        
        return inter;
    }

}
