package service;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class GoogleAdsFactory {
    private static GoogleAdsFactory googleAdsFactory;
    private AdRequest adRequest;

    private GoogleAdsFactory(){
        adRequest = new AdRequest.Builder().build();
    }

    public void loadBannerAd(AdView mAdView){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }



    public static GoogleAdsFactory getInstance(){
        return googleAdsFactory = googleAdsFactory==null ? new GoogleAdsFactory(): googleAdsFactory;
    }
}
