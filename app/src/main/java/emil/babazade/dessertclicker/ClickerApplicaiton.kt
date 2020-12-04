package emil.babazade.dessertclicker

import android.app.Application
import timber.log.Timber

class ClickerApplicaiton : Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}