package com.phonecontact_demo;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {

    @POST("/contact/saveContact.php")              // get list of responsible person to forward grievance
    @FormUrlEncoded
    Call<String> DepartmentNameList(@Field("apicall") String r,
                                               @Field("displayName") String a,
                                               @Field("contactNumbers") String b,
                                               @Field("contactEmailAddresses") String c,
                                               @Field("contctId") String d);

}
