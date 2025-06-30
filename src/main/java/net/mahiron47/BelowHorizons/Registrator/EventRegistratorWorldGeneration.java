package net.mahiron47.BelowHorizons.Registrator;

import net.mahiron47.BelowHorizons.Generator.VanilaUltraHardcoreGenerator;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Класс EventRegistratorWorldGeneration предназначен для регистрации событий,
 * связанных с генерацией мира. Он содержит обработчик события InitMapGenEvent,
 * которое вызывается при инициализации генерации различных структур в мире.
 *
 * Основная задача обработчика — заменить стандартную генерацию карты на
 * пользовательскую, используя класс VanilaUltraHardcoreGenerator.
 *
 * Методы:
 * - onInitMapGenEvent(InitMapGenEvent event): Обработчик события InitMapGenEvent,
 *   который устанавливает новую генерацию карты.
 *
 * Пример использования:
 * Зарегистрируйте данный класс как слушатель событий, чтобы заменить стандартную
 * генерацию мира на пользовательскую.
 */
public class EventRegistratorWorldGeneration {

    /**
     * Метод для замены генерации карты.
     * Событие InitMapGenEvent вызывается при инициализации генерации различных
     * структур в мире.
     *
     * @param event Событие генерации карты
     */
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onInitMapGenEvent(InitMapGenEvent event) {
        if (event.getType() == InitMapGenEvent.EventType.CAVE) {
            event.setNewGen(new VanilaUltraHardcoreGenerator());
        }
    }
}