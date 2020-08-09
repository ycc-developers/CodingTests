package com.ycc.hojong;

public class Solution1 {
    public int solve(String s) {
        int compressedLength = s.length();
        int min = compressedLength;
        StringBuilder compressedString = new StringBuilder();
        for( int i = 1; i <= compressedLength / 2; i++ ){
            int repeatedCount = 1;
            for( int j=0; j < compressedLength; j += i ){
                if( !getPartString( j, i, s ).equals( getPartString( j + i, i, s ) )  ){
                    if( repeatedCount != 1 ) compressedString.append( repeatedCount );
                    compressedString.append( getPartString( j, i, s ) );
                    repeatedCount = 1;
                }else{
                    repeatedCount++;
                }
            }
            min = Math.min( min, compressedString.length() );
            compressedString.delete( 0, compressedString.length() );
        }
        return min;
    }

    public String getPartString( int index, int length, String s ){
        StringBuilder partString = new StringBuilder();
        int compressedLength = s.length();
        for( int i = index; i < index+length && i < compressedLength; i++ ){
            partString.append( s.charAt(i) );
        }
        return partString.toString();
    }
}
