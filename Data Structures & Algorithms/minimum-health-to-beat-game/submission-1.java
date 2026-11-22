class Solution {


     public long minimumHealth(int[] damage, int armor) {
        long total = 0;
        int largest = 0;
        for (int hit : damage) {
            total += hit;
            largest = Math.max(largest, hit);
        }
        return total - Math.min(largest, armor) + 1;
    }
//     public long minimumHealth(int[] damage, int armor) {
// //i think binary seach will help here
// // i am guess max health will be 100000

// //solution will be nlogn

// //try binary search will be continously looking for the minium value between 0 to 100000 that can give use the result

//         long totalDamage=0l;

//         for(int curDam:damage){
//             totalDamage+=curDam;
//         }
//         if(totalDamage==0){
//             return 1l;
//         }


//         long maxHealth=100000l;
//         long l=0l;
//         long r=maxHealth;

//         long middle= 0l;

//         while(l<r)
//         {
//             middle= l+(r-l)/2;
//             if(isSufficientHealth(middle, damage,armor))
//             {
//                 r=middle;
//             }
//             else{
//                 l=middle+1;
//             }
//         }
//         return middle;
//     }


//     private boolean isSufficientHealth(
//         long health, int[] damage, int armor) {

//         long totalDamage = 0;
//         int maxDamage = 0;

//         for (int d : damage) {
//             totalDamage += d;
//             maxDamage = Math.max(maxDamage, d);
//         }

//         long actualDamage =
//             totalDamage - Math.min(maxDamage, armor);

//         return health > actualDamage;
//     }
}
