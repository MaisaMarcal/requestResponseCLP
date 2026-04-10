 package com.exemplo2.resquestresponseclp.dto;

public record ClpDataDTO( int dbNumber,
     int offset,
     int[] valores,
     String statusLeitura, 
     String timestampString) {
}