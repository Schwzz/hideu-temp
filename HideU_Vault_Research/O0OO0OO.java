package ambercore;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.calculator.hideu.filemgr.data.FileEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class O0OO0OO implements InterfaceC4046o0oO0O0O {
    private final RoomDatabase OooO00o;
    private final EntityInsertionAdapter OooO0O0;
    private final EntityDeletionOrUpdateAdapter OooO0OO;
    private final EntityDeletionOrUpdateAdapter OooO0Oo;

    class OooO implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooO(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i;
            String string;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                    if (cursorQuery.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow13;
                        string = null;
                    } else {
                        i = columnIndexOrThrow13;
                        string = cursorQuery.getString(columnIndexOrThrow14);
                    }
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow14;
                    int i6 = columnIndexOrThrow3;
                    int i7 = i2;
                    int i8 = columnIndexOrThrow2;
                    fileEntity.setId(cursorQuery.getLong(i7));
                    arrayList.add(new C5096oo000ooo(fileEntity, i3, string));
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow3 = i6;
                    i2 = i7;
                    columnIndexOrThrow14 = i5;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    class OooO00o implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooO00o(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public C5096oo000ooo call() {
            C5096oo000ooo c5096oo000ooo;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
                if (cursorQuery.moveToFirst()) {
                    int i = cursorQuery.getInt(columnIndexOrThrow13);
                    String string = cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14);
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                    c5096oo000ooo = new C5096oo000ooo(fileEntity, i, string);
                } else {
                    c5096oo000ooo = null;
                }
                return c5096oo000ooo;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    class OooO0O0 implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooO0O0(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public FileEntity call() {
            FileEntity fileEntity = null;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                if (cursorQuery.moveToFirst()) {
                    fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                }
                return fileEntity;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    class OooO0OO implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooO0OO(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                    arrayList.add(fileEntity);
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooO0Oo, reason: case insensitive filesystem */
    class CallableC1409OooO0Oo implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1409OooO0Oo(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i;
            String string;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                    if (cursorQuery.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow13;
                        string = null;
                    } else {
                        i = columnIndexOrThrow13;
                        string = cursorQuery.getString(columnIndexOrThrow14);
                    }
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow14;
                    int i6 = columnIndexOrThrow3;
                    int i7 = i2;
                    int i8 = columnIndexOrThrow2;
                    fileEntity.setId(cursorQuery.getLong(i7));
                    arrayList.add(new C5096oo000ooo(fileEntity, i3, string));
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow3 = i6;
                    i2 = i7;
                    columnIndexOrThrow14 = i5;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    class OooO0o implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooO0o(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i;
            String string;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                    if (cursorQuery.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow13;
                        string = null;
                    } else {
                        i = columnIndexOrThrow13;
                        string = cursorQuery.getString(columnIndexOrThrow14);
                    }
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow14;
                    int i6 = columnIndexOrThrow3;
                    int i7 = i2;
                    int i8 = columnIndexOrThrow2;
                    fileEntity.setId(cursorQuery.getLong(i7));
                    arrayList.add(new C5096oo000ooo(fileEntity, i3, string));
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow3 = i6;
                    i2 = i7;
                    columnIndexOrThrow14 = i5;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooO0o0, reason: case insensitive filesystem */
    class CallableC1410OooO0o0 implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1410OooO0o0(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                    arrayList.add(fileEntity);
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooO0oO, reason: case insensitive filesystem */
    class CallableC1411OooO0oO implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1411OooO0oO(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                    arrayList.add(fileEntity);
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooO0oo, reason: case insensitive filesystem */
    class C1412OooO0oo extends EntityInsertionAdapter {
        C1412OooO0oo(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR REPLACE INTO `file_table` (`name`,`path`,`hide_name`,`parent_id`,`mime_type`,`last_update`,`file_size`,`file_type`,`source_from`,`is_download`,`recycle_time`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, FileEntity fileEntity) {
            if (fileEntity.getName() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, fileEntity.getName());
            }
            if (fileEntity.getPath() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, fileEntity.getPath());
            }
            if (fileEntity.getHideName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, fileEntity.getHideName());
            }
            supportSQLiteStatement.bindLong(4, fileEntity.getParentId());
            if (fileEntity.getMimeType() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, fileEntity.getMimeType());
            }
            supportSQLiteStatement.bindLong(6, fileEntity.getLastUpdate());
            supportSQLiteStatement.bindLong(7, fileEntity.getFileSize());
            supportSQLiteStatement.bindLong(8, fileEntity.getFileType());
            supportSQLiteStatement.bindLong(9, fileEntity.getSourceFrom());
            supportSQLiteStatement.bindLong(10, fileEntity.isDownload() ? 1L : 0L);
            supportSQLiteStatement.bindLong(11, fileEntity.getRecycleTime());
            supportSQLiteStatement.bindLong(12, fileEntity.getId());
        }
    }

    class OooOO0 implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooOO0(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i;
            String string;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                    if (cursorQuery.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow13;
                        string = null;
                    } else {
                        i = columnIndexOrThrow13;
                        string = cursorQuery.getString(columnIndexOrThrow14);
                    }
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow14;
                    int i6 = columnIndexOrThrow3;
                    int i7 = i2;
                    int i8 = columnIndexOrThrow2;
                    fileEntity.setId(cursorQuery.getLong(i7));
                    arrayList.add(new C5096oo000ooo(fileEntity, i3, string));
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow3 = i6;
                    i2 = i7;
                    columnIndexOrThrow14 = i5;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    class OooOO0O implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooOO0O(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() throws Throwable {
            OooOO0O oooOO0O;
            int columnIndexOrThrow;
            int columnIndexOrThrow2;
            int columnIndexOrThrow3;
            int columnIndexOrThrow4;
            int columnIndexOrThrow5;
            int columnIndexOrThrow6;
            int columnIndexOrThrow7;
            int columnIndexOrThrow8;
            int columnIndexOrThrow9;
            int columnIndexOrThrow10;
            int columnIndexOrThrow11;
            int columnIndexOrThrow12;
            int columnIndexOrThrow13;
            int columnIndexOrThrow14;
            int i;
            String string;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
            } catch (Throwable th) {
                th = th;
                oooOO0O = this;
            }
            try {
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                    if (cursorQuery.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow13;
                        string = null;
                    } else {
                        i = columnIndexOrThrow13;
                        string = cursorQuery.getString(columnIndexOrThrow14);
                    }
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow14;
                    int i6 = columnIndexOrThrow3;
                    int i7 = i2;
                    int i8 = columnIndexOrThrow2;
                    fileEntity.setId(cursorQuery.getLong(i7));
                    arrayList.add(new C5096oo000ooo(fileEntity, i3, string));
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow3 = i6;
                    i2 = i7;
                    columnIndexOrThrow14 = i5;
                }
                cursorQuery.close();
                this.OooO00o.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                oooOO0O = this;
                cursorQuery.close();
                oooOO0O.OooO00o.release();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOO0o, reason: case insensitive filesystem */
    class CallableC1413OooOO0o implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1413OooOO0o(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i;
            String string;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                    if (cursorQuery.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow13;
                        string = null;
                    } else {
                        i = columnIndexOrThrow13;
                        string = cursorQuery.getString(columnIndexOrThrow14);
                    }
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow14;
                    int i6 = columnIndexOrThrow3;
                    int i7 = i2;
                    int i8 = columnIndexOrThrow2;
                    fileEntity.setId(cursorQuery.getLong(i7));
                    arrayList.add(new C5096oo000ooo(fileEntity, i3, string));
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow3 = i6;
                    i2 = i7;
                    columnIndexOrThrow14 = i5;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    class OooOOO implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooOOO(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int iValueOf = cursorQuery.moveToFirst() ? Integer.valueOf(cursorQuery.getInt(0)) : 0;
                cursorQuery.close();
                return iValueOf;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    class OooOOO0 implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooOOO0(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int iValueOf = cursorQuery.moveToFirst() ? Integer.valueOf(cursorQuery.getInt(0)) : 0;
                cursorQuery.close();
                return iValueOf;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    class OooOOOO implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooOOOO(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int iValueOf = cursorQuery.moveToFirst() ? Integer.valueOf(cursorQuery.getInt(0)) : 0;
                cursorQuery.close();
                this.OooO00o.release();
                return iValueOf;
            } catch (Throwable th) {
                cursorQuery.close();
                this.OooO00o.release();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOOOo, reason: case insensitive filesystem */
    class CallableC1414OooOOOo implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1414OooOOOo(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOOo, reason: case insensitive filesystem */
    class C1415OooOOo extends EntityDeletionOrUpdateAdapter {
        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, FileEntity fileEntity) {
            supportSQLiteStatement.bindLong(1, fileEntity.getId());
        }

        C1415OooOOo(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM `file_table` WHERE `id` = ?";
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOOo0, reason: case insensitive filesystem */
    class CallableC1416OooOOo0 implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1416OooOOo0(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int iValueOf = cursorQuery.moveToFirst() ? Integer.valueOf(cursorQuery.getInt(0)) : 0;
                cursorQuery.close();
                this.OooO00o.release();
                return iValueOf;
            } catch (Throwable th) {
                cursorQuery.close();
                this.OooO00o.release();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOOoo, reason: case insensitive filesystem */
    class CallableC1417OooOOoo implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1417OooOOoo(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Long call() {
            Long lValueOf = null;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    lValueOf = Long.valueOf(cursorQuery.getLong(0));
                }
                return lValueOf;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    class OooOo implements Callable {
        final /* synthetic */ FileEntity[] OooO00o;

        OooOo(FileEntity[] fileEntityArr) {
            this.OooO00o = fileEntityArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            O0OO0OO.this.OooO00o.beginTransaction();
            try {
                int iHandleMultiple = O0OO0OO.this.OooO0OO.handleMultiple(this.OooO00o);
                O0OO0OO.this.OooO00o.setTransactionSuccessful();
                return Integer.valueOf(iHandleMultiple);
            } finally {
                O0OO0OO.this.OooO00o.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOo0, reason: case insensitive filesystem */
    class C1418OooOo0 extends EntityDeletionOrUpdateAdapter {
        C1418OooOo0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `file_table` SET `name` = ?,`path` = ?,`hide_name` = ?,`parent_id` = ?,`mime_type` = ?,`last_update` = ?,`file_size` = ?,`file_type` = ?,`source_from` = ?,`is_download` = ?,`recycle_time` = ?,`id` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, FileEntity fileEntity) {
            if (fileEntity.getName() == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, fileEntity.getName());
            }
            if (fileEntity.getPath() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, fileEntity.getPath());
            }
            if (fileEntity.getHideName() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, fileEntity.getHideName());
            }
            supportSQLiteStatement.bindLong(4, fileEntity.getParentId());
            if (fileEntity.getMimeType() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, fileEntity.getMimeType());
            }
            supportSQLiteStatement.bindLong(6, fileEntity.getLastUpdate());
            supportSQLiteStatement.bindLong(7, fileEntity.getFileSize());
            supportSQLiteStatement.bindLong(8, fileEntity.getFileType());
            supportSQLiteStatement.bindLong(9, fileEntity.getSourceFrom());
            supportSQLiteStatement.bindLong(10, fileEntity.isDownload() ? 1L : 0L);
            supportSQLiteStatement.bindLong(11, fileEntity.getRecycleTime());
            supportSQLiteStatement.bindLong(12, fileEntity.getId());
            supportSQLiteStatement.bindLong(13, fileEntity.getId());
        }
    }

    class OooOo00 implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        OooOo00(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            int i;
            String string;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupState");
                int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "backupDriveId");
                int i2 = columnIndexOrThrow12;
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                    if (cursorQuery.isNull(columnIndexOrThrow14)) {
                        i = columnIndexOrThrow13;
                        string = null;
                    } else {
                        i = columnIndexOrThrow13;
                        string = cursorQuery.getString(columnIndexOrThrow14);
                    }
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i4 = columnIndexOrThrow;
                    int i5 = columnIndexOrThrow14;
                    int i6 = columnIndexOrThrow3;
                    int i7 = i2;
                    int i8 = columnIndexOrThrow2;
                    fileEntity.setId(cursorQuery.getLong(i7));
                    arrayList.add(new C5096oo000ooo(fileEntity, i3, string));
                    columnIndexOrThrow2 = i8;
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow13 = i;
                    columnIndexOrThrow3 = i6;
                    i2 = i7;
                    columnIndexOrThrow14 = i5;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
            }
        }

        protected void finalize() {
            this.OooO00o.release();
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOo0O, reason: case insensitive filesystem */
    class CallableC1419OooOo0O implements Callable {
        final /* synthetic */ FileEntity OooO00o;

        CallableC1419OooOo0O(FileEntity fileEntity) {
            this.OooO00o = fileEntity;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Long call() {
            O0OO0OO.this.OooO00o.beginTransaction();
            try {
                long jInsertAndReturnId = O0OO0OO.this.OooO0O0.insertAndReturnId(this.OooO00o);
                O0OO0OO.this.OooO00o.setTransactionSuccessful();
                return Long.valueOf(jInsertAndReturnId);
            } finally {
                O0OO0OO.this.OooO00o.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOo0o, reason: case insensitive filesystem */
    class CallableC1420OooOo0o implements Callable {
        final /* synthetic */ FileEntity[] OooO00o;

        CallableC1420OooOo0o(FileEntity[] fileEntityArr) {
            this.OooO00o = fileEntityArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public C7028ze0 call() {
            O0OO0OO.this.OooO00o.beginTransaction();
            try {
                O0OO0OO.this.OooO0O0.insert((Object[]) this.OooO00o);
                O0OO0OO.this.OooO00o.setTransactionSuccessful();
                return C7028ze0.OooO00o;
            } finally {
                O0OO0OO.this.OooO00o.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOoO, reason: case insensitive filesystem */
    class CallableC1421OooOoO implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1421OooOoO(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public List call() {
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    int i = columnIndexOrThrow2;
                    int i2 = columnIndexOrThrow3;
                    fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                    arrayList.add(fileEntity);
                    columnIndexOrThrow2 = i;
                    columnIndexOrThrow3 = i2;
                }
                return arrayList;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOoO0, reason: case insensitive filesystem */
    class CallableC1422OooOoO0 implements Callable {
        final /* synthetic */ FileEntity[] OooO00o;

        CallableC1422OooOoO0(FileEntity[] fileEntityArr) {
            this.OooO00o = fileEntityArr;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            O0OO0OO.this.OooO00o.beginTransaction();
            try {
                int iHandleMultiple = O0OO0OO.this.OooO0Oo.handleMultiple(this.OooO00o);
                O0OO0OO.this.OooO00o.setTransactionSuccessful();
                return Integer.valueOf(iHandleMultiple);
            } finally {
                O0OO0OO.this.OooO00o.endTransaction();
            }
        }
    }

    /* JADX INFO: renamed from: ambercore.O0OO0OO$OooOoOO, reason: case insensitive filesystem */
    class CallableC1423OooOoOO implements Callable {
        final /* synthetic */ RoomSQLiteQuery OooO00o;

        CallableC1423OooOoOO(RoomSQLiteQuery roomSQLiteQuery) {
            this.OooO00o = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public FileEntity call() {
            FileEntity fileEntity = null;
            Cursor cursorQuery = DBUtil.query(O0OO0OO.this.OooO00o, this.OooO00o, false, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
                int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
                int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
                int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
                int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                if (cursorQuery.moveToFirst()) {
                    fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                    fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                }
                return fileEntity;
            } finally {
                cursorQuery.close();
                this.OooO00o.release();
            }
        }
    }

    public static List OooO0oo() {
        return Collections.EMPTY_LIST;
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooO00o(int i, int i2, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from file_table WHERE is_download = 1 AND recycle_time = 0 LIMIT ? OFFSET ? ", 2);
        roomSQLiteQueryAcquire.bindLong(1, i);
        roomSQLiteQueryAcquire.bindLong(2, i2);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new CallableC1410OooO0o0(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooO0O0(long j, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM file_table WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, j);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new CallableC1423OooOoOO(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooO0OO(FileEntity[] fileEntityArr, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        return CoroutinesRoom.execute(this.OooO00o, true, new CallableC1422OooOoO0(fileEntityArr), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOO0o(FileEntity fileEntity, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        return CoroutinesRoom.execute(this.OooO00o, true, new CallableC1419OooOo0O(fileEntity), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public List OooOOO() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM file_table WHERE recycle_time != 0", 0);
        this.OooO00o.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.OooO00o, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "path");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "hide_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "parent_id");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "mime_type");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "last_update");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_size");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "file_type");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "source_from");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "is_download");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "recycle_time");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                FileEntity fileEntity = new FileEntity(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.getLong(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.getLong(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8), cursorQuery.getInt(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getLong(columnIndexOrThrow11));
                int i = columnIndexOrThrow2;
                int i2 = columnIndexOrThrow3;
                fileEntity.setId(cursorQuery.getLong(columnIndexOrThrow12));
                arrayList.add(fileEntity);
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            return arrayList;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOOOO(String str, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM file_table WHERE hide_name=?", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new OooO0O0(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOOOo(InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM file_table", 0);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new CallableC1421OooOoO(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOOo(long j, int i, int i2, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId from file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.fileType=0 AND bb.userId=? WHERE parent_id = ? AND recycle_time = 0 LIMIT ? OFFSET ? ", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        roomSQLiteQueryAcquire.bindLong(3, i);
        roomSQLiteQueryAcquire.bindLong(4, i2);
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table", "BackupBean"}, false, new CallableC1409OooO0Oo(roomSQLiteQueryAcquire));
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOo(InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT last_update from file_table WHERE last_update = (SELECT MAX(last_update) FROM file_table WHERE recycle_time = 0 AND is_download = true)", 0);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new CallableC1417OooOOoo(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOo0(FileEntity[] fileEntityArr, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        return CoroutinesRoom.execute(this.OooO00o, true, new OooOo(fileEntityArr), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOo00(String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId from file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.fileType=0 AND bb.userId=? WHERE  recycle_time != 0 ORDER BY recycle_time DESC", 1);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table", "BackupBean"}, false, new OooOo00(roomSQLiteQueryAcquire));
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOo0O(long j, int i, int i2, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId from file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.fileType=0 AND bb.userId=? WHERE parent_id = ? AND recycle_time = 0 LIMIT ? OFFSET ? ", 4);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        roomSQLiteQueryAcquire.bindLong(3, i);
        roomSQLiteQueryAcquire.bindLong(4, i2);
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table", "BackupBean"}, false, new OooOO0(roomSQLiteQueryAcquire));
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOoO0(int i, int i2, String str) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId from file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.fileType=0 AND bb.userId=? WHERE is_download = 1 AND recycle_time = 0 LIMIT ? OFFSET ? ", 3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table", "BackupBean"}, false, new OooO0o(roomSQLiteQueryAcquire));
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOoOO(FileEntity[] fileEntityArr, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        return CoroutinesRoom.execute(this.OooO00o, true, new CallableC1420OooOo0o(fileEntityArr), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOoo(boolean z) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(id) FROM file_table WHERE is_download = ? AND recycle_time = 0", 1);
        roomSQLiteQueryAcquire.bindLong(1, z ? 1L : 0L);
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table"}, false, new OooOOO0(roomSQLiteQueryAcquire));
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOoo0(int i, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT last_update from file_table WHERE last_update = (SELECT MAX(last_update) FROM file_table WHERE file_type = ? AND recycle_time = 0 AND is_download = false)", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new CallableC1414OooOOOo(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOooo(int i, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT count(*) from file_table WHERE file_type = ? AND recycle_time = 0 AND is_download = false", 1);
        roomSQLiteQueryAcquire.bindLong(1, i);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new OooOOOO(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object Oooo000(long j, String str, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId FROM file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.userId=? WHERE ft.id = ?", 2);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        roomSQLiteQueryAcquire.bindLong(2, j);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new OooO00o(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object Oooo00O(long j, int i, int i2, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from file_table WHERE parent_id = ? AND recycle_time = 0 LIMIT ? OFFSET ? ", 3);
        roomSQLiteQueryAcquire.bindLong(1, j);
        roomSQLiteQueryAcquire.bindLong(2, i);
        roomSQLiteQueryAcquire.bindLong(3, i2);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new OooO0OO(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object Oooo00o(InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT count(*) from file_table WHERE recycle_time = 0 AND is_download = true", 0);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new CallableC1416OooOOo0(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public int getFileCount() {
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT COUNT(id) FROM file_table WHERE file_type != 0", 0);
        this.OooO00o.assertNotSuspendingTransaction();
        Cursor cursorQuery = DBUtil.query(this.OooO00o, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public O0OO0OO(RoomDatabase roomDatabase) {
        this.OooO00o = roomDatabase;
        this.OooO0O0 = new C1412OooO0oo(roomDatabase);
        this.OooO0OO = new C1415OooOOo(roomDatabase);
        this.OooO0Oo = new C1418OooOo0(roomDatabase);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOOo0(int[] iArr, long j, int i, int i2, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT * from file_table WHERE file_type IN (");
        int length = iArr.length;
        StringUtil.appendPlaceholders(sbNewStringBuilder, length);
        sbNewStringBuilder.append(") AND parent_id = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND recycle_time = 0 LIMIT ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" OFFSET ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" ");
        int i3 = length + 3;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), i3);
        int i4 = 1;
        for (int i5 : iArr) {
            roomSQLiteQueryAcquire.bindLong(i4, i5);
            i4++;
        }
        roomSQLiteQueryAcquire.bindLong(length + 1, j);
        roomSQLiteQueryAcquire.bindLong(length + 2, i);
        roomSQLiteQueryAcquire.bindLong(i3, i2);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new CallableC1411OooO0oO(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOOoo(int[] iArr, long j, int i, int i2, String str) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId from file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.fileType=0 AND bb.userId=");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE file_type IN (");
        int length = iArr.length;
        StringUtil.appendPlaceholders(sbNewStringBuilder, length);
        sbNewStringBuilder.append(") AND parent_id = ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" AND recycle_time = 0 LIMIT ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" OFFSET ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" ");
        int i3 = length + 4;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), i3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        int i4 = 2;
        for (int i5 : iArr) {
            roomSQLiteQueryAcquire.bindLong(i4, i5);
            i4++;
        }
        roomSQLiteQueryAcquire.bindLong(length + 2, j);
        roomSQLiteQueryAcquire.bindLong(length + 3, i);
        roomSQLiteQueryAcquire.bindLong(i3, i2);
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table", "BackupBean"}, false, new OooO(roomSQLiteQueryAcquire));
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public Object OooOo0o(int[] iArr, int i, int i2, String str, InterfaceC4966oOooO0O0 interfaceC4966oOooO0O0) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId FROM file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.fileType=0 AND bb.userId=");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE file_type IN (");
        int length = iArr.length;
        StringUtil.appendPlaceholders(sbNewStringBuilder, length);
        sbNewStringBuilder.append(") AND recycle_time = 0 LIMIT ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" OFFSET ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" ");
        int i3 = length + 3;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), i3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        int i4 = 2;
        for (int i5 : iArr) {
            roomSQLiteQueryAcquire.bindLong(i4, i5);
            i4++;
        }
        roomSQLiteQueryAcquire.bindLong(length + 2, i);
        roomSQLiteQueryAcquire.bindLong(i3, i2);
        return CoroutinesRoom.execute(this.OooO00o, false, DBUtil.createCancellationSignal(), new OooOO0O(roomSQLiteQueryAcquire), interfaceC4966oOooO0O0);
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOoO(int[] iArr, int i, int i2, String str) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT ft.*, bb.state AS backupState, bb.driveId AS backupDriveId FROM file_table ft LEFT JOIN BackupBean bb ON ft.id = bb.fileId AND bb.fileType=0 AND bb.userId=");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" WHERE file_type IN (");
        int length = iArr.length;
        StringUtil.appendPlaceholders(sbNewStringBuilder, length);
        sbNewStringBuilder.append(") AND recycle_time = 0 LIMIT ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" OFFSET ");
        sbNewStringBuilder.append("?");
        sbNewStringBuilder.append(" ");
        int i3 = length + 3;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), i3);
        if (str == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        int i4 = 2;
        for (int i5 : iArr) {
            roomSQLiteQueryAcquire.bindLong(i4, i5);
            i4++;
        }
        roomSQLiteQueryAcquire.bindLong(length + 2, i);
        roomSQLiteQueryAcquire.bindLong(i3, i2);
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table", "BackupBean"}, false, new CallableC1413OooOO0o(roomSQLiteQueryAcquire));
    }

    @Override // ambercore.InterfaceC4046o0oO0O0O
    public LiveData OooOooO(int[] iArr) {
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT COUNT(id) FROM file_table WHERE file_type IN (");
        int length = iArr.length;
        StringUtil.appendPlaceholders(sbNewStringBuilder, length);
        sbNewStringBuilder.append(") AND recycle_time = 0");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), length);
        int i = 1;
        for (int i2 : iArr) {
            roomSQLiteQueryAcquire.bindLong(i, i2);
            i++;
        }
        return this.OooO00o.getInvalidationTracker().createLiveData(new String[]{"file_table"}, false, new OooOOO(roomSQLiteQueryAcquire));
    }
}
