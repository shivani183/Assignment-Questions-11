

/*Given an integer array nums, return an integer array counts where counts[i] is the 
number of smaller elements to the right of nums[i].*/

package AssignmentQuestions19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Que2 {
	
	int[] count;
    Pair[] pairs;
    class Pair
    {
      
       int value;
       int index;
        Pair(int a, int b)
        {
            value=a;
            index=b;
        }
    }
   public List<Integer> countSmaller(int[] nums) {
       pairs= new Pair[nums.length];
       int i=0;
       for( i=0;i<nums.length;i++)
           pairs[i]=new Pair(nums[i],i);
       count = new int[nums.length];
       mergeSort(0,nums.length-1);
       return Arrays.stream(count).boxed().collect(Collectors.toList()); 
   }

   void mergeSort(int l, int r)
   {
       if(r>l)
       {
           int mid=l-(l-r)/2;
           mergeSort(l,mid);
           mergeSort(mid+1,r);
           merge(l,mid,r);
       }
       return;
   }

   void merge(int l, int mid, int r)
   {
       int n1=mid+1-l, n2= r-mid;
       Pair[] a = new Pair[n1];
       Pair[] b = new Pair[n2];
       int i=0, j=0 ,k=l;
       for(i=0;i<n1;i++)
           a[i]=pairs[i+l];
       for(i=0;i<n2;i++)
           b[i]=pairs[i+mid+1];    

       i=0; j=0;
       while(i<n1 && j<n2)
       {
           while(j<n2 && a[i].value>b[j].value)
               j++;

           if(j==n2) break;

           while(i<n1 && a[i].value<=b[j].value)
           {
               count[pairs[l+i].index]=j+count[pairs[l+i].index];
               i++;
           }
       }
       while(i<n1)
       {
               count[pairs[l+i].index]=j+count[pairs[l+i].index];
               i++;
       }

       i=0; j=0;
       k=l;
       while(i<n1 && j<n2)
       {
           if(a[i].value>b[j].value)
               pairs[k++]=b[j++];
           else
               pairs[k++]=a[i++];
       }
       while(i<n1)
       {
           pairs[k++]=a[i++];
       }
       while(j<n2)
       {
           pairs[k++]=b[j++];
       }
      }

}
