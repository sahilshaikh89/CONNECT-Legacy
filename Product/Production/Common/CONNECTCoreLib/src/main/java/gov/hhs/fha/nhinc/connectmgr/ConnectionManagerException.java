/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *  
 * Copyright 2010(Year date of delivery) United States Government, as represented by the Secretary of Health and Human Services.  All rights reserved.
 *  
 */
package gov.hhs.fha.nhinc.connectmgr;

/**
 * This exception is thrown when an error occurs accessing properties.
 * 
 * @author Les Westberg
 */
public class ConnectionManagerException extends Exception
{
    private static final long serialVersionUID = -2763323716005332016L;
    
    /**
     * Default constructor.
     */
    public ConnectionManagerException()
    {
        super();
    }
    
    /**
     * Constructor with an envloping exception.
     * 
     * @param e  The exception that caused this one.
     */
    public ConnectionManagerException(Exception e)
    {
        super(e);
    }

    /**
     * Constructor with the given exception and message.
     * 
     * @param sMessage The message to place in the exception.
     * @param e The exception that triggered this one.
     */
    public ConnectionManagerException(String sMessage, Exception e)
    {
        super(sMessage, e);
    }

    /**
     * Constructor with a given message.
     * 
     * @param sMessage The message for the exception.
     */
    public ConnectionManagerException(String sMessage)
    {
        super(sMessage);
    }
    
}
