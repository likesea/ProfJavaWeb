package com.liuyb;

/**
 * Created by liuyb on 2015/11/19.
 */
public class Attachment {
    private String name;

    private byte[] contents;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public byte[] getContents()
    {
        return contents;
    }

    public void setContents(byte[] contents)
    {
        this.contents = contents;
    }
}
