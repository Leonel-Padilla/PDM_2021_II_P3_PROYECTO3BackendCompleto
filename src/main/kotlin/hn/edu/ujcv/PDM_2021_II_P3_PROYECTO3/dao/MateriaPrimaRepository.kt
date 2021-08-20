package hn.edu.ujcv.PDM_2021_II_P3_PROYECTO3.dao

import hn.edu.ujcv.PDM_2021_II_P3_PROYECTO3.model.MateriaPrima
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MateriaPrimaRepository: JpaRepository<MateriaPrima, Long> {
    fun findByNombreMateria(nombreMateria:String): Optional<MateriaPrima>
}
