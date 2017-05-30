package ex_1_1_22_to_23;

import java.util.HashMap;

public class BinarySearchClient {

	public static int rank(int key,int[] a){
		return rank(key,a,0,a.length-1,1);
	}
	
	
	public static int rank(int key , int[] a,int lo,int hi,int iterNum){
		

		if(lo>hi)return -1;
		int mid = lo+(hi-lo)/2;
		System.out.println("IterNumber :" +iterNum + " lo: "+lo+" hi:"+hi +" mid :"+mid);

		if(key<a[mid]) return rank(key,a,lo,mid-1,iterNum+1);
		else if(key > a[mid])  return rank(key,a,mid+1,hi,iterNum+1);
		else return mid;
		
		
	}
	
	public static void main(String[] args) {
		int argArray[] = {1,2,3,4,5,6,7,8};
		int intsToBeSearched[] = {14,3,2,1,2};
		HashMap<Integer,Integer> results = new HashMap<Integer,Integer>();
		for(int t : intsToBeSearched){
			//results.add(rank(t,argArray));
			results.put(t, rank(t,argArray));
		//	System.out.println(rank(t,argArray));

		}
	
		System.out.println(results);
		
		
	}

}
