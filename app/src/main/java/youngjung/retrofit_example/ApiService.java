package youngjung.retrofit_example;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by HANSUNG on 2017-12-09.
 */

public interface ApiService {
    public static final String API_URL = "http://jsonplaceholder.typicode.com/";

    //int로 넘겨줄때
    @GET("comments")
    Call<ResponseBody>getComment(@Query("postId")int postId);

    @POST("comments")
    Call<ResponseBody>getPostComment(@Query("postId")int postId);

    //String으로 넘겨줄때
    @GET("comments")
    Call<ResponseBody>getCommentStr(@Query("postId")String postId);

    //FromUrlEncoded 추가 및 @Query가 아닌 @Field임.
    @FormUrlEncoded
    @POST("comments")
    Call<ResponseBody>getPostCommentStr(@Field("postId")String postId);
}
