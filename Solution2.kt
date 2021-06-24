fun countUpAndDown(n:Int):Array<Int>
{
    var a=Array<Int>(2*n+1) { 0 }
    var i=0; var value=0
    while (i!=a.size)
    {
        if(i<n)
            a[i++]=value++
        else if(i>=n)
            a[i++]=value--
    }
    return a // T(n)=O(n) S(n)=1
}
fun main()
{
    val n=5
    var res: Array<Int> = countUpAndDown(n)
    for (j in res)
        print(j)
}
