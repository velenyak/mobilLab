package com.bme.janosvelenyak.mobillab.api;

import com.bme.janosvelenyak.mobillab.model.InlineResponse200;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.bme.janosvelenyak.mobillab.model.InlineResponse200;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2001;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2003;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2004;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GifsApi {
  
  /**
   * Get GIFs by ID
   * &lt;p&gt;A multiget version of the get GIF by ID endpoint. In this case the IDs are feqkVgjJpYtjy and 7rzbxdu0ZEXLy.  Note the additional user metadata attached to the document that describes the second GIF in the response, 7rzbxdu0ZEXLy.&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/gifs?api_key=dc6zaTOxFJmzC&amp;amp;ids=feqkVgjJpYtjy,7rzbxdu0ZEXLy\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs?api_key=dc6zaTOxFJmzC&amp;ids=feqkVgjJpYtjy,7rzbxdu0ZEXLy\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt;&lt;/p&gt;
   * @param apiKey 
   * @param ids 
   * @return Call<InlineResponse200>
   */
  
  @GET("gifs")
  Call<InlineResponse200> gETGifs(
          @Query("ids") String ids, @Query("api_key") String apiKey
  );

  
  /**
   * Random
   * &lt;p&gt;Returns a random GIF, limited by tag. Excluding the tag parameter will return a random GIF from the Giphy catalog.&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/gifs/random?api_key=dc6zaTOxFJmzC&amp;amp;tag=american+psycho\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/random?api_key=dc6zaTOxFJmzC&amp;tag=american+psycho\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt;&lt;/p&gt;
   * @param apiKey 
   * @param tag 
   * @return Call<InlineResponse2001>
   */
  
  @GET("gifs/random")
  Call<InlineResponse2001> gETGifsRandom(
          @Query("tag") String tag, @Query("api_key") String apiKey
  );

  
  /**
   * Search
   * &lt;p&gt;Search all Giphy GIFs for a word or phrase. Punctuation will be stripped and ignored. Use a plus or url encode for phrases.&lt;/p&gt;\n&lt;p&gt;Examples:&lt;/p&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/search?q=paul+rudd&amp;api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;paul+rudd&lt;/a&gt;&lt;/p&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/search?q=ryan+gosling&amp;api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;ryan+gosling&lt;/a&gt;&lt;/p&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/search?q=american+psycho&amp;api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;american+psycho&lt;/a&gt;&lt;/p&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/search?q=funny+cat&amp;api_key=dc6zaTOxFJmzC&amp;limit=1&amp;offset=0\&quot; target=\&quot;_blank\&quot;&gt;funny+cat&lt;/a&gt;&lt;/p&gt;
   * @param apiKey 
   * @param q 
   * @param limit 
   * @param offset 
   * @return Call<InlineResponse2002>
   */
  
  @GET("gifs/search")
  Call<InlineResponse2002> gETGifsSearch(
          @Query("q") String q, @Query("limit") Integer limit, @Query("offset") Integer offset, @Query("api_key") String apiKey
  );

  
  /**
   * Translate
   * &lt;p&gt;The translate API draws on search, but uses the Giphy &amp;quot;special sauce&amp;quot; to handle translating from one vocabulary to another. In this case, words and phrases to GIFs. Example implementations of translate can be found in the Giphy &lt;a href=\&quot;http://giphy.com/posts/slack-adds-giphy-to-every-chatroom-wut\&quot; target=\&quot;_blank\&quot;&gt;Slack&lt;/a&gt;, &lt;a href=\&quot;https://marketplace.atlassian.com/plugins/com.giphy.api.hipchat\&quot; target=\&quot;_blank\&quot;&gt;Hipchat&lt;/a&gt;, &lt;a href=\&quot;https://wire.com/news/giphy-say-it-with-gif\&quot; target=\&quot;_blank\&quot;&gt;Wire&lt;/a&gt;, or &lt;a href=\&quot;https://dasher.im/\&quot; target=\&quot;_blank\&quot;&gt;Dasher&lt;/a&gt; integrations. Use a plus or url encode for phrases.&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/gifs/translate?s=superman&amp;amp;api_key=dc6zaTOxFJmzC\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/translate?s=superman&amp;api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt;&lt;/p&gt;
   * @param apiKey 
   * @param s 
   * @return Call<InlineResponse2003>
   */
  
  @GET("gifs/translate")
  Call<InlineResponse2003> gETGifsTranslate(
          @Query("s") String s, @Query("api_key") String apiKey
  );

  
  /**
   * Trending GIFs
   * &lt;p&gt;Fetch GIFs currently trending online. Hand curated by the Giphy editorial team. The data returned mirrors the GIFs showcased on the &lt;a href=\&quot;\&quot; target=\&quot;_blank\&quot;&gt;&lt;/a&gt;&lt;a target=\&quot;_blank\&quot; href=\&quot;http://giphy.com\&quot; class=\&quot;undefined\&quot;&gt;Giphy homepage&lt;/a&gt;. Returns 25 results by default.&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/gifs/trending?api_key=dc6zaTOxFJmzC\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/trending?api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt; trending GIFs query.\n&lt;a href=\&quot;http://api.giphy.com/v1/gifs/trending?api_key=dc6zaTOxFJmzC&amp;limit=5\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt; trending GIFs limited to 5 results.&lt;/p&gt;
   * @param apiKey 
   * @param limit 
   * @return Call<InlineResponse2004>
   */
  
  @GET("gifs/trending")
  Call<InlineResponse2004> gETGifsTrending(
          @Query("limit") Integer limit, @Query("api_key") String apiKey
  );

  
  /**
   * Get GIF by ID
   * &lt;p&gt;Returns meta data about a GIF, by GIF id. In the below example, the GIF ID is &amp;quot;feqkVgjJpYtjy&amp;quot;&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/gifs/feqkVgjJpYtjy?api_key=dc6zaTOxFJmzC\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/gifs/feqkVgjJpYtjy?api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt;&lt;/p&gt;
   * @param gifId 
   * @param apiKey 
   * @return Call<InlineResponse200>
   */
  
  @GET("gifs/{gif-id}")
  Call<InlineResponse200> gETGifsGifId(
          @Path("gif-id") String gifId, @Query("api_key") String apiKey
  );

  
}
