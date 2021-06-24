fun capitalizeSentence(s:String):StringBuilder
{
    var my_string = StringBuilder()

    my_string.append(s.elementAt(0).uppercase())
    for(i in 1..(s.length-1))
    {
        if(s.elementAt(i-1)==' ' && (s.elementAt(i).code>='a'.code && s.elementAt(i).code<='z'.code || s.elementAt(i).code>='A'.code && s.elementAt(i).code<='Z'.code))
            my_string.append(s.elementAt(i).uppercase())
        else
            my_string.append(s.elementAt(i))
    }
    return my_string // T(n)=O(n) S(n)=O(n)
}
fun main()
{
    var s=capitalizeSentence(" hello there we are here")
    println(s)
}