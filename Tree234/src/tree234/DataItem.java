/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree234;

/**
 *
 * @author yeerick
 */
public class DataItem {

    public long dData;          // one data item
//--------------------------------------------------------------

    public DataItem(long dd) // constructor
    {
        dData = dd;
    }
//--------------------------------------------------------------

    public void displayItem() // display item, format "/27"
    {
        System.out.print("/" + dData);
    }
//--------------------------------------------------------------
}

