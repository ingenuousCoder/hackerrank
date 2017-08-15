package com.ingenuous.cci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Alpeshk on 6/14/2017.
 */
public class FieldList {
    public FieldList (){
        List<Field> Fields = new ArrayList<Field>();

        Field F0 = new Field("DefaultField0", "String", null,null, null,"20");
        Field F1 = new Field("DefaultField1", "Float", null,null, null,"20");
        Field F2 = new Field("DefaultField2", "Double", null,null, null,"20");
        Field F3 = new Field("DefaultField0", "Integer", null,null, null,"20");
        Field F4 = new Field("DefaultField1", "Float", null,null, null,"20");

        Fields.add(F0);
        Fields.add(F1);
        Fields.add(F2);
        Fields.add(F3);
        Fields.add(F4);

    }
}
