package younippon.github.io.android_material_components

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import younippon.github.io.android_material_components.adapter.HomePagerAdapter

/**
 * Created by yo on 16/07/31.
 */

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)

        val tabLayout = view.findViewById(R.id.tab_layout) as TabLayout
        tabLayout.addTab(tabLayout.newTab())
        tabLayout.addTab(tabLayout.newTab())
        tabLayout.addTab(tabLayout.newTab())

        val viewPager = view.findViewById(R.id.view_pager) as ViewPager
        val manager = activity.getSupportFragmentManager()
        viewPager.adapter = HomePagerAdapter(manager)

        tabLayout.setupWithViewPager(viewPager)

        return view
    }
}