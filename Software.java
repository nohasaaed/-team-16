

    static void DistinctArr(int [] arr, int len)
    {
        for (int i = 0; i < len; i++)
        {    int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                System.out.print( arr[i] + " ");
        }

}
