package com.day4;


public class InsufficientFundsException extends Exception
{
    public InsufficientFundsException ()
    {
        super ();
    }
    public InsufficientFundsException (String msg)
    {
        super (msg);
    }
}