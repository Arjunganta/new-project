

public class AllOccurances {
	public static int getElemen(int[] a,int x,boolean searc){
		int start=0,end=a.length-1,result=-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(x==a[mid]){
				result=mid;
				if(searc)
					end=mid-1;
				else
				start=mid+1;
			}
			else if(x<a[mid]){
				end=mid-1;
			}
			else if(x>a[mid]){
				start=mid+1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int [] arr={1,5,5,5,5,5,5};
		int element=5;
		int lastindex=0;
int firstindex=getElemen(arr,element,true);
if(firstindex==-1){
	System.out.println("the element not found in the array");
}
else{
	 String sr="We are here to check git commits/branches";
}

}
}
