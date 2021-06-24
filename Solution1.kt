fun surrondedLetter(s:String): Boolean
{
    var plus='+'.code
    var code_of_first= s.elementAt(0).code
    var code_of_last=s.elementAt(s.length-1).code
    var b:Boolean=true;
    if(code_of_first>='a'.code && code_of_first<='z'.code || code_of_first>='A'.code && code_of_first<='Z'.code)
        b=false
    else if (code_of_last>='a'.code && code_of_last<='z'.code || code_of_last>='A'.code && code_of_last<='Z'.code)
        b=false;
    else
    {
        var a=Array<Int>(s.length) { 0 }
        var i=0;
        var count=0;
        for (j in s.indices)
        {
            var code_of_j=s.elementAt(j).code
            if(code_of_j>='a'.code && code_of_j<='z'.code || code_of_j>='A'.code && code_of_j<='Z'.code)
            {
                count++
                a[i++]=j
            }
        }
        i=0
        /*for (k in a)
            print(k)*/
        while (count!=0)
        {
            if(s.elementAt(a[i]-1).code!=plus || s.elementAt(a[i]+1).code!=plus)
            {
                b = false;
                break
            }
            count--
            i++
        }
    }
    return b //T(n)=O(n) worst Case and S(n)=O(n)
}

fun main()
{
    var result=surrondedLetter("+a+b+")
    println(result)
}