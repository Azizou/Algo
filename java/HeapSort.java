/**
 * Azizou Ogbone
 * Simpe implementation of a heapSort
 */
class HeapSort{
    public static void BuildMaxHeap(int unordered[]){
        /*
         * for i in n/2 down to 1
         * call max_heapify(A, i)
         *
         */
        for(int i=unordered.length/2;i>=0; i--){
            max_heapify(unordered, i,unordered.length);
        }
    }


    public static void heapsort(int A[]){
        /*
         * swap 0 and end
         * max_heapify(A,0,size)
         *
         */
        BuildMaxHeap(A);
        int size = A.length;
        while(size >0){
            int tmp = A[0];
            A[0]=A[size-1];
            A[size-1] = tmp;
            max_heapify(A,0,--size);
        }
    }
    public static void show(int[] A){
        for(int i=0; i<A.length;i++){
            System.out.println(i + ": " +A[i] + " ");
        }
    }
    public static void BuildMinHeap(int unordered[]){
        /*
         *
         * fori in n/2 downto 1
         *  do min_heapify(A, i)
         *
         *
         */
    }

    public static void main(String args[]){
        int data[] = {1,3,-1,4,5,2,0};
        //BuildMaxHeap(data);
        heapsort(data);
        show(data);
    }

    public static void max_heapify(int A[], int i,int size){
        int l = 2*i+1;
        int r = 2*i+2;

        int largest = i;
        if(l<size && A[l]>A[largest]){
            largest = l;
        }
        if(r< size && A[r] > A[largest]){
            largest = r;
        }
        if(largest != i){
            int tmp = A[largest];
            A[largest] = A[i];
            A[i] = tmp;
            max_heapify(A,largest, size);
        }
    }
}
