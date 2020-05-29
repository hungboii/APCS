public int count ElectronicsByMaker(String maker)
{
    int count = 0;
    for(Gizmo purchase : purchases)
    {
        if(purchase.getMaker().equals(maker) && puchase.getElectronic())
            count++;
    }
    return count;
}


public boolean hasAdjacentEqualPair()
{
    for(int i = 0; i < purchases.length - 1; i++)
    {
        if(puchases.get(i).equals(puchases.get(i + 1)))
            return ture;
        
    }
    return false;
}


public static boolean isValid(int numWithCheckDigit)
{
    if(numWithCheckDigit % 10 == getCheck(numWithCheckDigit / 10))
        return true;
    return false;
}

