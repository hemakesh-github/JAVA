Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();
        int sorted_arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++) {
            sorted_arr[i] = scan.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = scan.nextInt();
        BinarySearch arr = new BinarySearch(sorted_arr);
        int index1 = arr.DoBinarySearch(key);
        if (index1 != -1) {
            System.out.println(index1);
        }
        else {
            System.out.println("Element not found");
        }
        scan.close();
    }  
}



