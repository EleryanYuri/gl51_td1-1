package gl51.service

import gl51.data.Cloud

/**
 * ceci update la base de données
 */
interface DatabaseUpdateService {

    /**
     * update la base de données
     * @return
     */
    boolean updateDatabase(Cloud cloud)
}

