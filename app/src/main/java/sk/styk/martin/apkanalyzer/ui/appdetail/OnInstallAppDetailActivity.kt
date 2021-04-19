package sk.styk.martin.apkanalyzer.ui.appdetail

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnInstallAppDetailActivity : AppDetailActivity() {

    override fun getDetailRequestBundle(): Bundle? {
        return intent.data?.let {
            Bundle().apply {
                putParcelable(APP_DETAIL_REQUEST, AppDetailRequest.ExternalPackage(it))
            }
        }
    }

}
