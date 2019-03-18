package com.igen.rhzl.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class VehicleBatchDay {
    private Integer id;

    private String batchid;

    private Date countday;

    private Integer count;

    private Long summileage;

    private Long avgmileage;

    private Long avgmileageyx;

    private Long sumuptime;

    private Long avguptime;

    private Long avguptimeyx;

    private Long inefficentcnt;

    private Long inefficentprg;

    private Long efficentcnt;

    private Long efficentprg;

    private Long exceptioncnt;

    private Long leaseprg;

    private Long offlinecnt;

}