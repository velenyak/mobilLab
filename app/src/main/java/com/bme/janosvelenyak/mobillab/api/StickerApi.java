package com.bme.janosvelenyak.mobillab.api;

import com.bme.janosvelenyak.mobillab.model.InlineResponse200;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2001;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2003;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2005;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StickerApi {
  
  /**
   * Random
   * &lt;p&gt;Returns a spotaneously selected sticker from Giphy&#39;s sticker collection. Optionally limit scope of result to a specific tag. Like the GIF random endpoint, Punctuation will be stripped and ignored. Use a hyphen for phrases. Example &lt;a href=\&quot;http://api.giphy.com/v1/stickers/random?api_key=dc6zaTOxFJmzC&amp;tag=oops\&quot; target=\&quot;_blank\&quot;&gt;oops&lt;/a&gt;, &lt;a href=\&quot;http://api.giphy.com/v1/stickers/random?api_key=dc6zaTOxFJmzC&amp;tag=birthday\&quot; target=\&quot;_blank\&quot;&gt;birthday&lt;/a&gt; or &lt;a href=\&quot;http://api.giphy.com/v1/stickers/random?api_key=dc6zaTOxFJmzC&amp;tag=whatever\&quot; target=\&quot;_blank\&quot;&gt;thank-you&lt;/a&gt;. Search terms should be URL encoded.&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/stickers/random?api_key=dc6zaTOxFJmzC&amp;amp;tag=oops\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/stickers/random?api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt; random query.&lt;/p&gt;
   * @param apiKey 
   * @return Call<InlineResponse2001>
   */
  
  @GET("stickers/random")
  Call<InlineResponse2001> gETStickersRandom(
          @Query("api_key") String apiKey
  );

  
  /**
   * Search
   * &lt;p&gt;Replicates the functionality and requirements of the classic Giphy search, but returns animated stickers rather than gifs. Example &lt;a href=\&quot;http://api.giphy.com/v1/stickers/search?q=cat&amp;api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;Cat&lt;/a&gt;&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/stickers/search?q=cat&amp;amp;api_key=dc6zaTOxFJmzC&lt;/code&gt;&lt;/pre&gt;
   * @param apiKey 
   * @param q 
   * @return Call<InlineResponse200>
   */
  
  @GET("stickers/search")
  Call<InlineResponse200> gETStickersSearch(
          @Query("api_key") String apiKey, @Query("q") String q
  );

  
  /**
   * Translate
   * &lt;p&gt;Using the same alogirithm as the GIF translate endpoint, the sticker translate endpoint turns words into stickers.&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/stickers/translate?s=hungry&amp;amp;api_key=dc6zaTOxFJmzC\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/stickers/translate?s=hungry&amp;api_key=dc6zaTOxFJmzC\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt; translate query.&lt;/p&gt;
   * @param apiKey 
   * @param s 
   * @return Call<InlineResponse2003>
   */
  
  @GET("stickers/translate")
  Call<InlineResponse2003> gETStickersTranslate(
          @Query("api_key") String apiKey, @Query("s") String s
  );

  
  /**
   * Trending
   * &lt;p&gt;Get the latest stickers trending on Giphy with this endpoint. Hand curated by the Giphy editorial team and refreshed daily.&lt;/p&gt;\n&lt;pre&gt;&lt;code&gt;http://api.giphy.com/v1/stickers/trending?api_key=dc6zaTOxFJmzC\n&lt;/code&gt;&lt;/pre&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/stickers/trending?api_key=dc6zaTOxFJmzC&amp;limit=4&amp;fmt=html\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt; trending query with html formatted response.&lt;/p&gt;\n&lt;p&gt;&lt;a href=\&quot;http://api.giphy.com/v1/stickers/trending?api_key=dc6zaTOxFJmzC&amp;limit=4\&quot; target=\&quot;_blank\&quot;&gt;Example&lt;/a&gt; trending query with default json response.&lt;/p&gt;
   * @param apiKey 
   * @param limit 
   * @return Call<InlineResponse2005>
   */
  
  @GET("stickers/trending")
  Call<InlineResponse2005> gETStickersTrending(
          @Query("api_key") String apiKey, @Query("limit") Integer limit
  );

  
}
