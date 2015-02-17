/*
 * #%L
 * Fork of Apache Jakarta POI.
 * %%
 * Copyright (C) 2008 - 2014 Open Microscopy Environment:
 *   - Board of Regents of the University of Wisconsin-Madison
 *   - Glencoe Software, Inc.
 *   - University of Dundee
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */
        

package loci.poi.hssf.record;



import loci.poi.util.*;

/**
 * Indicates the chart-group index for a series.  The order probably defines the mapping.  So the 0th record probably means the 0th series.  The only field in this of course defines which chart group the 0th series (for instance) would map to.  Confusing?  Well thats because it is.  (p 522 BCG)
 * NOTE: This source is automatically generated please do not modify this file.  Either subclass or
 *       remove the record in src/records/definitions.

 * @author Andrew C. Oliver (acoliver at apache.org)
 */
public class SeriesToChartGroupRecord
    extends Record
{
    public final static short      sid                             = 0x1045;
    private  short      field_1_chartGroupIndex;


    public SeriesToChartGroupRecord()
    {

    }

    /**
     * Constructs a SeriesToChartGroup record and sets its fields appropriately.
     *
     * @param in the RecordInputstream to read the record from
     */

    public SeriesToChartGroupRecord(RecordInputStream in)
    {
        super(in);
    
    }

    /**
     * Checks the sid matches the expected side for this record
     *
     * @param id   the expected sid.
     */
    protected void validateSid(short id)
    {
        if (id != sid)
        {
            throw new RecordFormatException("Not a SeriesToChartGroup record");
        }
    }

    protected void fillFields(RecordInputStream in)
    {
        field_1_chartGroupIndex        = in.readShort();
    }

    public String toString()
    {
        StringBuffer buffer = new StringBuffer();

        buffer.append("[SeriesToChartGroup]\n");
        buffer.append("    .chartGroupIndex      = ")
            .append("0x").append(HexDump.toHex(  getChartGroupIndex ()))
            .append(" (").append( getChartGroupIndex() ).append(" )");
        buffer.append(System.getProperty("line.separator")); 

        buffer.append("[/SeriesToChartGroup]\n");
        return buffer.toString();
    }

    public int serialize(int offset, byte[] data)
    {
        int pos = 0;

        LittleEndian.putShort(data, 0 + offset, sid);
        LittleEndian.putShort(data, 2 + offset, (short)(getRecordSize() - 4));

        LittleEndian.putShort(data, 4 + offset + pos, field_1_chartGroupIndex);

        return getRecordSize();
    }

    /**
     * Size of record (exluding 4 byte header)
     */
    public int getRecordSize()
    {
        return 4  + 2;
    }

    public short getSid()
    {
        return sid;
    }

    public Object clone() {
        SeriesToChartGroupRecord rec = new SeriesToChartGroupRecord();
    
        rec.field_1_chartGroupIndex = field_1_chartGroupIndex;
        return rec;
    }




    /**
     * Get the chart group index field for the SeriesToChartGroup record.
     */
    public short getChartGroupIndex()
    {
        return field_1_chartGroupIndex;
    }

    /**
     * Set the chart group index field for the SeriesToChartGroup record.
     */
    public void setChartGroupIndex(short field_1_chartGroupIndex)
    {
        this.field_1_chartGroupIndex = field_1_chartGroupIndex;
    }


}  // END OF CLASS




