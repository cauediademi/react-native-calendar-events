import { TurboModule, TurboModuleRegistry } from 'react-native'
import {
  AuthorizationStatus,
  Calendar,
  CalendarEventReadable,
  CalendarEventWritable,
  CalendarOptions,
  ISODateString,
  Options,
} from './index'

export interface Spec extends TurboModule {
  readonly getConstants: () => {}
  checkPermissions(limited?: boolean): Promise<AuthorizationStatus>
  getCalendars(): Promise<Calendar[]>
  getEventById(id: string): Promise<CalendarEventReadable | null>
  getEvents(
    startDate: ISODateString,
    endDate: ISODateString,
    calendarIds?: string[],
  ): Promise<CalendarEventReadable[]>
  openEventInCalendar(eventID: string): Promise<void>
  removeCalendar(id: string): Promise<boolean>
  removeEvent(id: string, options?: Options): Promise<boolean>
  requestPermissions(limited?: boolean): Promise<AuthorizationStatus>
  saveCalendar(calendar: CalendarOptions): Promise<string>
  saveEvent(title: string, details: CalendarEventWritable, options?: Options): Promise<string>
  uriForCalendar(): Promise<string>
}

export default TurboModuleRegistry.get<Spec>('RNCalendarEvents')
