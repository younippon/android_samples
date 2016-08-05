package younippon.github.io.android_material_components.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by yo on 16/08/02.
 */

class HomePagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    companion object {
        fun getInstance() : HomePagerAdapter {
            return getInstance()
        }
    }

    override fun getItem(position: Int): Fragment {

        var fragment: Fragment = Fragment()
        when (position) {
            0 -> fragment = Fragment()
            1 -> fragment = Fragment()
            2 -> fragment = Fragment()
            else -> {
            }
        }
        return fragment
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "タブ" + (position + 1)
    }
}
