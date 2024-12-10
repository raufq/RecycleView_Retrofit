package me.mehadih.retrofitlivedatamvvmrecyclerviewdatabinding.api;

import java.util.List;

import me.mehadih.retrofitlivedatamvvmrecyclerviewdatabinding.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequestData {
    @GET("resource/s3k6-pzi2.json")
    Call<List<User>> getUsers();

}
