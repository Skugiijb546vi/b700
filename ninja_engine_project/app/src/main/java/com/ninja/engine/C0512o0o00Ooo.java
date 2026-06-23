package com.ninja.engine;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* renamed from: com.ninja.engine.o0o00Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512o0o00Ooo {
    public static final boolean OooOO0o = Log.isLoggable("ExifInterface", 3);
    public static final int[] OooOOO;
    public static final int[] OooOOO0;
    public static final byte[] OooOOOO;
    public static final byte[] OooOOOo;
    public static final byte[] OooOOo;
    public static final byte[] OooOOo0;
    public static final byte[] OooOOoo;
    public static final byte[] OooOo;
    public static final byte[] OooOo0;
    public static final byte[] OooOo00;
    public static final byte[] OooOo0O;
    public static final byte[] OooOo0o;
    public static final byte[] OooOoO;
    public static final byte[] OooOoO0;
    public static final byte[] OooOoOO;
    public static final int[] OooOoo;
    public static final String[] OooOoo0;
    public static final byte[] OooOooO;
    public static final C0510o0o00Oo0 OooOooo;
    public static final HashMap[] Oooo0;
    public static final C0510o0o00Oo0[][] Oooo000;
    public static final C0510o0o00Oo0[] Oooo00O;
    public static final HashMap[] Oooo00o;
    public static final HashSet Oooo0O0;
    public static final HashMap Oooo0OO;
    public static final byte[] Oooo0o;
    public static final Charset Oooo0o0;
    public static final byte[] Oooo0oO;
    public int OooO;
    public final FileDescriptor OooO00o;
    public final AssetManager.AssetInputStream OooO0O0;
    public int OooO0OO;
    public final HashMap[] OooO0Oo;
    public ByteOrder OooO0o;
    public final HashSet OooO0o0;
    public boolean OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;

    static {
        C0510o0o00Oo0[] c0510o0o00Oo0Arr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        OooOOO0 = new int[]{8, 8, 8};
        OooOOO = new int[]{8};
        OooOOOO = new byte[]{-1, -40, -1};
        OooOOOo = new byte[]{102, 116, 121, 112};
        OooOOo0 = new byte[]{109, 105, 102, 49};
        OooOOo = new byte[]{104, 101, 105, 99};
        OooOOoo = new byte[]{79, 76, 89, 77, 80, 0};
        OooOo00 = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        OooOo0 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        OooOo0O = new byte[]{101, 88, 73, 102};
        OooOo0o = new byte[]{73, 72, 68, 82};
        OooOo = new byte[]{73, 69, 78, 68};
        OooOoO0 = new byte[]{82, 73, 70, 70};
        OooOoO = new byte[]{87, 69, 66, 80};
        OooOoOO = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        OooOoo0 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        OooOoo = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        OooOooO = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0510o0o00Oo0[] c0510o0o00Oo0Arr2 = {new C0510o0o00Oo0("NewSubfileType", 254, 4), new C0510o0o00Oo0("SubfileType", 255, 4), new C0510o0o00Oo0("ImageWidth", 256, 3, 4), new C0510o0o00Oo0("ImageLength", 257, 3, 4), new C0510o0o00Oo0("BitsPerSample", 258, 3), new C0510o0o00Oo0("Compression", 259, 3), new C0510o0o00Oo0("PhotometricInterpretation", 262, 3), new C0510o0o00Oo0("ImageDescription", 270, 2), new C0510o0o00Oo0("Make", 271, 2), new C0510o0o00Oo0("Model", 272, 2), new C0510o0o00Oo0("StripOffsets", 273, 3, 4), new C0510o0o00Oo0("Orientation", 274, 3), new C0510o0o00Oo0("SamplesPerPixel", 277, 3), new C0510o0o00Oo0("RowsPerStrip", 278, 3, 4), new C0510o0o00Oo0("StripByteCounts", 279, 3, 4), new C0510o0o00Oo0("XResolution", 282, 5), new C0510o0o00Oo0("YResolution", 283, 5), new C0510o0o00Oo0("PlanarConfiguration", 284, 3), new C0510o0o00Oo0("ResolutionUnit", 296, 3), new C0510o0o00Oo0("TransferFunction", 301, 3), new C0510o0o00Oo0("Software", 305, 2), new C0510o0o00Oo0("DateTime", 306, 2), new C0510o0o00Oo0("Artist", 315, 2), new C0510o0o00Oo0("WhitePoint", 318, 5), new C0510o0o00Oo0("PrimaryChromaticities", 319, 5), new C0510o0o00Oo0("SubIFDPointer", 330, 4), new C0510o0o00Oo0("JPEGInterchangeFormat", 513, 4), new C0510o0o00Oo0("JPEGInterchangeFormatLength", 514, 4), new C0510o0o00Oo0("YCbCrCoefficients", 529, 5), new C0510o0o00Oo0("YCbCrSubSampling", 530, 3), new C0510o0o00Oo0("YCbCrPositioning", 531, 3), new C0510o0o00Oo0("ReferenceBlackWhite", 532, 5), new C0510o0o00Oo0("Copyright", 33432, 2), new C0510o0o00Oo0("ExifIFDPointer", 34665, 4), new C0510o0o00Oo0("GPSInfoIFDPointer", 34853, 4), new C0510o0o00Oo0("SensorTopBorder", 4, 4), new C0510o0o00Oo0("SensorLeftBorder", 5, 4), new C0510o0o00Oo0("SensorBottomBorder", 6, 4), new C0510o0o00Oo0("SensorRightBorder", 7, 4), new C0510o0o00Oo0("ISO", 23, 3), new C0510o0o00Oo0("JpgFromRaw", 46, 7), new C0510o0o00Oo0("Xmp", 700, 1)};
        OooOooo = new C0510o0o00Oo0("StripOffsets", 273, 3);
        Oooo000 = new C0510o0o00Oo0[][]{c0510o0o00Oo0Arr2, new C0510o0o00Oo0[]{new C0510o0o00Oo0("ExposureTime", 33434, 5), new C0510o0o00Oo0("FNumber", 33437, 5), new C0510o0o00Oo0("ExposureProgram", 34850, 3), new C0510o0o00Oo0("SpectralSensitivity", 34852, 2), new C0510o0o00Oo0("PhotographicSensitivity", 34855, 3), new C0510o0o00Oo0("OECF", 34856, 7), new C0510o0o00Oo0("SensitivityType", 34864, 3), new C0510o0o00Oo0("StandardOutputSensitivity", 34865, 4), new C0510o0o00Oo0("RecommendedExposureIndex", 34866, 4), new C0510o0o00Oo0("ISOSpeed", 34867, 4), new C0510o0o00Oo0("ISOSpeedLatitudeyyy", 34868, 4), new C0510o0o00Oo0("ISOSpeedLatitudezzz", 34869, 4), new C0510o0o00Oo0("ExifVersion", 36864, 2), new C0510o0o00Oo0("DateTimeOriginal", 36867, 2), new C0510o0o00Oo0("DateTimeDigitized", 36868, 2), new C0510o0o00Oo0("OffsetTime", 36880, 2), new C0510o0o00Oo0("OffsetTimeOriginal", 36881, 2), new C0510o0o00Oo0("OffsetTimeDigitized", 36882, 2), new C0510o0o00Oo0("ComponentsConfiguration", 37121, 7), new C0510o0o00Oo0("CompressedBitsPerPixel", 37122, 5), new C0510o0o00Oo0("ShutterSpeedValue", 37377, 10), new C0510o0o00Oo0("ApertureValue", 37378, 5), new C0510o0o00Oo0("BrightnessValue", 37379, 10), new C0510o0o00Oo0("ExposureBiasValue", 37380, 10), new C0510o0o00Oo0("MaxApertureValue", 37381, 5), new C0510o0o00Oo0("SubjectDistance", 37382, 5), new C0510o0o00Oo0("MeteringMode", 37383, 3), new C0510o0o00Oo0("LightSource", 37384, 3), new C0510o0o00Oo0("Flash", 37385, 3), new C0510o0o00Oo0("FocalLength", 37386, 5), new C0510o0o00Oo0("SubjectArea", 37396, 3), new C0510o0o00Oo0("MakerNote", 37500, 7), new C0510o0o00Oo0("UserComment", 37510, 7), new C0510o0o00Oo0("SubSecTime", 37520, 2), new C0510o0o00Oo0("SubSecTimeOriginal", 37521, 2), new C0510o0o00Oo0("SubSecTimeDigitized", 37522, 2), new C0510o0o00Oo0("FlashpixVersion", 40960, 7), new C0510o0o00Oo0("ColorSpace", 40961, 3), new C0510o0o00Oo0("PixelXDimension", 40962, 3, 4), new C0510o0o00Oo0("PixelYDimension", 40963, 3, 4), new C0510o0o00Oo0("RelatedSoundFile", 40964, 2), new C0510o0o00Oo0("InteroperabilityIFDPointer", 40965, 4), new C0510o0o00Oo0("FlashEnergy", 41483, 5), new C0510o0o00Oo0("SpatialFrequencyResponse", 41484, 7), new C0510o0o00Oo0("FocalPlaneXResolution", 41486, 5), new C0510o0o00Oo0("FocalPlaneYResolution", 41487, 5), new C0510o0o00Oo0("FocalPlaneResolutionUnit", 41488, 3), new C0510o0o00Oo0("SubjectLocation", 41492, 3), new C0510o0o00Oo0("ExposureIndex", 41493, 5), new C0510o0o00Oo0("SensingMethod", 41495, 3), new C0510o0o00Oo0("FileSource", 41728, 7), new C0510o0o00Oo0("SceneType", 41729, 7), new C0510o0o00Oo0("CFAPattern", 41730, 7), new C0510o0o00Oo0("CustomRendered", 41985, 3), new C0510o0o00Oo0("ExposureMode", 41986, 3), new C0510o0o00Oo0("WhiteBalance", 41987, 3), new C0510o0o00Oo0("DigitalZoomRatio", 41988, 5), new C0510o0o00Oo0("FocalLengthIn35mmFilm", 41989, 3), new C0510o0o00Oo0("SceneCaptureType", 41990, 3), new C0510o0o00Oo0("GainControl", 41991, 3), new C0510o0o00Oo0("Contrast", 41992, 3), new C0510o0o00Oo0("Saturation", 41993, 3), new C0510o0o00Oo0("Sharpness", 41994, 3), new C0510o0o00Oo0("DeviceSettingDescription", 41995, 7), new C0510o0o00Oo0("SubjectDistanceRange", 41996, 3), new C0510o0o00Oo0("ImageUniqueID", 42016, 2), new C0510o0o00Oo0("CameraOwnerName", 42032, 2), new C0510o0o00Oo0("BodySerialNumber", 42033, 2), new C0510o0o00Oo0("LensSpecification", 42034, 5), new C0510o0o00Oo0("LensMake", 42035, 2), new C0510o0o00Oo0("LensModel", 42036, 2), new C0510o0o00Oo0("Gamma", 42240, 5), new C0510o0o00Oo0("DNGVersion", 50706, 1), new C0510o0o00Oo0("DefaultCropSize", 50720, 3, 4)}, new C0510o0o00Oo0[]{new C0510o0o00Oo0("GPSVersionID", 0, 1), new C0510o0o00Oo0("GPSLatitudeRef", 1, 2), new C0510o0o00Oo0("GPSLatitude", 2, 5, 10), new C0510o0o00Oo0("GPSLongitudeRef", 3, 2), new C0510o0o00Oo0("GPSLongitude", 4, 5, 10), new C0510o0o00Oo0("GPSAltitudeRef", 5, 1), new C0510o0o00Oo0("GPSAltitude", 6, 5), new C0510o0o00Oo0("GPSTimeStamp", 7, 5), new C0510o0o00Oo0("GPSSatellites", 8, 2), new C0510o0o00Oo0("GPSStatus", 9, 2), new C0510o0o00Oo0("GPSMeasureMode", 10, 2), new C0510o0o00Oo0("GPSDOP", 11, 5), new C0510o0o00Oo0("GPSSpeedRef", 12, 2), new C0510o0o00Oo0("GPSSpeed", 13, 5), new C0510o0o00Oo0("GPSTrackRef", 14, 2), new C0510o0o00Oo0("GPSTrack", 15, 5), new C0510o0o00Oo0("GPSImgDirectionRef", 16, 2), new C0510o0o00Oo0("GPSImgDirection", 17, 5), new C0510o0o00Oo0("GPSMapDatum", 18, 2), new C0510o0o00Oo0("GPSDestLatitudeRef", 19, 2), new C0510o0o00Oo0("GPSDestLatitude", 20, 5), new C0510o0o00Oo0("GPSDestLongitudeRef", 21, 2), new C0510o0o00Oo0("GPSDestLongitude", 22, 5), new C0510o0o00Oo0("GPSDestBearingRef", 23, 2), new C0510o0o00Oo0("GPSDestBearing", 24, 5), new C0510o0o00Oo0("GPSDestDistanceRef", 25, 2), new C0510o0o00Oo0("GPSDestDistance", 26, 5), new C0510o0o00Oo0("GPSProcessingMethod", 27, 7), new C0510o0o00Oo0("GPSAreaInformation", 28, 7), new C0510o0o00Oo0("GPSDateStamp", 29, 2), new C0510o0o00Oo0("GPSDifferential", 30, 3), new C0510o0o00Oo0("GPSHPositioningError", 31, 5)}, new C0510o0o00Oo0[]{new C0510o0o00Oo0("InteroperabilityIndex", 1, 2)}, new C0510o0o00Oo0[]{new C0510o0o00Oo0("NewSubfileType", 254, 4), new C0510o0o00Oo0("SubfileType", 255, 4), new C0510o0o00Oo0("ThumbnailImageWidth", 256, 3, 4), new C0510o0o00Oo0("ThumbnailImageLength", 257, 3, 4), new C0510o0o00Oo0("BitsPerSample", 258, 3), new C0510o0o00Oo0("Compression", 259, 3), new C0510o0o00Oo0("PhotometricInterpretation", 262, 3), new C0510o0o00Oo0("ImageDescription", 270, 2), new C0510o0o00Oo0("Make", 271, 2), new C0510o0o00Oo0("Model", 272, 2), new C0510o0o00Oo0("StripOffsets", 273, 3, 4), new C0510o0o00Oo0("ThumbnailOrientation", 274, 3), new C0510o0o00Oo0("SamplesPerPixel", 277, 3), new C0510o0o00Oo0("RowsPerStrip", 278, 3, 4), new C0510o0o00Oo0("StripByteCounts", 279, 3, 4), new C0510o0o00Oo0("XResolution", 282, 5), new C0510o0o00Oo0("YResolution", 283, 5), new C0510o0o00Oo0("PlanarConfiguration", 284, 3), new C0510o0o00Oo0("ResolutionUnit", 296, 3), new C0510o0o00Oo0("TransferFunction", 301, 3), new C0510o0o00Oo0("Software", 305, 2), new C0510o0o00Oo0("DateTime", 306, 2), new C0510o0o00Oo0("Artist", 315, 2), new C0510o0o00Oo0("WhitePoint", 318, 5), new C0510o0o00Oo0("PrimaryChromaticities", 319, 5), new C0510o0o00Oo0("SubIFDPointer", 330, 4), new C0510o0o00Oo0("JPEGInterchangeFormat", 513, 4), new C0510o0o00Oo0("JPEGInterchangeFormatLength", 514, 4), new C0510o0o00Oo0("YCbCrCoefficients", 529, 5), new C0510o0o00Oo0("YCbCrSubSampling", 530, 3), new C0510o0o00Oo0("YCbCrPositioning", 531, 3), new C0510o0o00Oo0("ReferenceBlackWhite", 532, 5), new C0510o0o00Oo0("Copyright", 33432, 2), new C0510o0o00Oo0("ExifIFDPointer", 34665, 4), new C0510o0o00Oo0("GPSInfoIFDPointer", 34853, 4), new C0510o0o00Oo0("DNGVersion", 50706, 1), new C0510o0o00Oo0("DefaultCropSize", 50720, 3, 4)}, c0510o0o00Oo0Arr2, new C0510o0o00Oo0[]{new C0510o0o00Oo0("ThumbnailImage", 256, 7), new C0510o0o00Oo0("CameraSettingsIFDPointer", 8224, 4), new C0510o0o00Oo0("ImageProcessingIFDPointer", 8256, 4)}, new C0510o0o00Oo0[]{new C0510o0o00Oo0("PreviewImageStart", 257, 4), new C0510o0o00Oo0("PreviewImageLength", 258, 4)}, new C0510o0o00Oo0[]{new C0510o0o00Oo0("AspectFrame", 4371, 3)}, new C0510o0o00Oo0[]{new C0510o0o00Oo0("ColorSpace", 55, 3)}};
        Oooo00O = new C0510o0o00Oo0[]{new C0510o0o00Oo0("SubIFDPointer", 330, 4), new C0510o0o00Oo0("ExifIFDPointer", 34665, 4), new C0510o0o00Oo0("GPSInfoIFDPointer", 34853, 4), new C0510o0o00Oo0("InteroperabilityIFDPointer", 40965, 4), new C0510o0o00Oo0("CameraSettingsIFDPointer", 8224, 1), new C0510o0o00Oo0("ImageProcessingIFDPointer", 8256, 1)};
        Oooo00o = new HashMap[10];
        Oooo0 = new HashMap[10];
        Oooo0O0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        Oooo0OO = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        Oooo0o0 = forName;
        Oooo0o = "Exif\u0000\u0000".getBytes(forName);
        Oooo0oO = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0510o0o00Oo0[][] c0510o0o00Oo0Arr3 = Oooo000;
            if (i >= c0510o0o00Oo0Arr3.length) {
                HashMap hashMap = Oooo0OO;
                C0510o0o00Oo0[] c0510o0o00Oo0Arr4 = Oooo00O;
                hashMap.put(Integer.valueOf(c0510o0o00Oo0Arr4[0].OooO00o), 5);
                hashMap.put(Integer.valueOf(c0510o0o00Oo0Arr4[1].OooO00o), 1);
                hashMap.put(Integer.valueOf(c0510o0o00Oo0Arr4[2].OooO00o), 2);
                hashMap.put(Integer.valueOf(c0510o0o00Oo0Arr4[3].OooO00o), 3);
                hashMap.put(Integer.valueOf(c0510o0o00Oo0Arr4[4].OooO00o), 7);
                hashMap.put(Integer.valueOf(c0510o0o00Oo0Arr4[5].OooO00o), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Oooo00o[i] = new HashMap();
            Oooo0[i] = new HashMap();
            for (C0510o0o00Oo0 c0510o0o00Oo0 : c0510o0o00Oo0Arr3[i]) {
                Oooo00o[i].put(Integer.valueOf(c0510o0o00Oo0.OooO00o), c0510o0o00Oo0);
                Oooo0[i].put(c0510o0o00Oo0.OooO0O0, c0510o0o00Oo0);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: all -> 0x0056, IOException | UnsupportedOperationException -> 0x0059, LOOP:0: B:63:0x0047->B:17:0x004a, LOOP_END, TryCatch #3 {IOException | UnsupportedOperationException -> 0x0059, all -> 0x0056, blocks: (B:15:0x0047, B:17:0x004a, B:21:0x005c, B:27:0x0079, B:29:0x0084, B:37:0x009a, B:32:0x008b, B:35:0x0093, B:36:0x0097, B:38:0x00a4, B:40:0x00ad, B:42:0x00b3, B:44:0x00b9, B:46:0x00bf), top: B:63:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x0056, IOException | UnsupportedOperationException -> 0x0059, TryCatch #3 {IOException | UnsupportedOperationException -> 0x0059, all -> 0x0056, blocks: (B:15:0x0047, B:17:0x004a, B:21:0x005c, B:27:0x0079, B:29:0x0084, B:37:0x009a, B:32:0x008b, B:35:0x0093, B:36:0x0097, B:38:0x00a4, B:40:0x00ad, B:42:0x00b3, B:44:0x00b9, B:46:0x00bf), top: B:63:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[Catch: all -> 0x0056, IOException | UnsupportedOperationException -> 0x0059, TryCatch #3 {IOException | UnsupportedOperationException -> 0x0059, all -> 0x0056, blocks: (B:15:0x0047, B:17:0x004a, B:21:0x005c, B:27:0x0079, B:29:0x0084, B:37:0x009a, B:32:0x008b, B:35:0x0093, B:36:0x0097, B:38:0x00a4, B:40:0x00ad, B:42:0x00b3, B:44:0x00b9, B:46:0x00bf), top: B:63:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0512o0o00Ooo(java.io.InputStream r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0512o0o00Ooo.<init>(java.io.InputStream):void");
    }

    public static ByteOrder OooOOo0(C0507o0o00OOO c0507o0o00OOO) {
        short readShort = c0507o0o00OOO.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void OooO(C0507o0o00OOO c0507o0o00OOO) {
        if (OooOO0o) {
            Objects.toString(c0507o0o00OOO);
        }
        c0507o0o00OOO.OooO00o(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0507o0o00OOO.read(bArr);
        c0507o0o00OOO.read(bArr2);
        c0507o0o00OOO.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c0507o0o00OOO.OooO00o(i - c0507o0o00OOO.OooO0OO);
        c0507o0o00OOO.read(bArr4);
        OooO0o0(new C0507o0o00OOO(bArr4), i, 5);
        c0507o0o00OOO.OooO00o(i3 - c0507o0o00OOO.OooO0OO);
        c0507o0o00OOO.OooO0O0 = ByteOrder.BIG_ENDIAN;
        int readInt = c0507o0o00OOO.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c0507o0o00OOO.readUnsignedShort();
            int readUnsignedShort2 = c0507o0o00OOO.readUnsignedShort();
            if (readUnsignedShort == OooOooo.OooO00o) {
                short readShort = c0507o0o00OOO.readShort();
                short readShort2 = c0507o0o00OOO.readShort();
                C0508o0o00OOo OooO0OO = C0508o0o00OOo.OooO0OO(readShort, this.OooO0o);
                C0508o0o00OOo OooO0OO2 = C0508o0o00OOo.OooO0OO(readShort2, this.OooO0o);
                HashMap[] hashMapArr = this.OooO0Oo;
                hashMapArr[0].put("ImageLength", OooO0OO);
                hashMapArr[0].put("ImageWidth", OooO0OO2);
                return;
            }
            c0507o0o00OOO.OooO00o(readUnsignedShort2);
        }
    }

    public final void OooO00o() {
        String OooO0O0 = OooO0O0("DateTimeOriginal");
        HashMap[] hashMapArr = this.OooO0Oo;
        if (OooO0O0 != null && OooO0O0("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = OooO0O0.concat("\u0000").getBytes(Oooo0o0);
            hashMap.put("DateTime", new C0508o0o00OOo(bytes, 2, bytes.length));
        }
        if (OooO0O0("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C0508o0o00OOo.OooO00o(0L, this.OooO0o));
        }
        if (OooO0O0("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C0508o0o00OOo.OooO00o(0L, this.OooO0o));
        }
        if (OooO0O0("Orientation") == null) {
            hashMapArr[0].put("Orientation", C0508o0o00OOo.OooO00o(0L, this.OooO0o));
        }
        if (OooO0O0("LightSource") == null) {
            hashMapArr[1].put("LightSource", C0508o0o00OOo.OooO00o(0L, this.OooO0o));
        }
    }

    public final String OooO0O0(String str) {
        C0508o0o00OOo OooO0OO = OooO0OO(str);
        if (OooO0OO != null) {
            if (!Oooo0O0.contains(str)) {
                return OooO0OO.OooO0o(this.OooO0o);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = OooO0OO.OooO00o;
                if (i != 5 && i != 10) {
                    return null;
                }
                C0509o0o00Oo[] c0509o0o00OoArr = (C0509o0o00Oo[]) OooO0OO.OooO0oO(this.OooO0o);
                if (c0509o0o00OoArr != null && c0509o0o00OoArr.length == 3) {
                    C0509o0o00Oo c0509o0o00Oo = c0509o0o00OoArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) c0509o0o00Oo.OooO00o) / ((float) c0509o0o00Oo.OooO0O0)));
                    C0509o0o00Oo c0509o0o00Oo2 = c0509o0o00OoArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) c0509o0o00Oo2.OooO00o) / ((float) c0509o0o00Oo2.OooO0O0)));
                    C0509o0o00Oo c0509o0o00Oo3 = c0509o0o00OoArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) c0509o0o00Oo3.OooO00o) / ((float) c0509o0o00Oo3.OooO0O0))));
                }
                Arrays.toString(c0509o0o00OoArr);
                return null;
            }
            try {
                return Double.toString(OooO0OO.OooO0Oo(this.OooO0o));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final C0508o0o00OOo OooO0OO(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < Oooo000.length; i++) {
            C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) this.OooO0Oo[i].get(str);
            if (c0508o0o00OOo != null) {
                return c0508o0o00OOo;
            }
        }
        return null;
    }

    public final void OooO0Oo(C0511o0o00OoO c0511o0o00OoO) {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    AbstractC0516o0o00o0O.OooO00o(mediaMetadataRetriever, new C0506o0o00OO0(c0511o0o00OoO));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.OooO0Oo;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", C0508o0o00OOo.OooO0OO(Integer.parseInt(str), this.OooO0o));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", C0508o0o00OOo.OooO0OO(Integer.parseInt(str2), this.OooO0o));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        hashMapArr[0].put("Orientation", C0508o0o00OOo.OooO0OO(i, this.OooO0o));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c0511o0o00OoO.OooO0O0(parseInt2);
                            byte[] bArr = new byte[6];
                            if (c0511o0o00OoO.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, Oooo0o)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (c0511o0o00OoO.read(bArr2) == i3) {
                                        this.OooO0oo = i2;
                                        OooOOo(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0154, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int OooO0o(java.io.BufferedInputStream r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0512o0o00Ooo.OooO0o(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x015f, code lost:
        r23.OooO0O0 = r22.OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0163, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c A[LOOP:0: B:10:0x0024->B:82:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o0(com.ninja.engine.C0507o0o00OOO r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0512o0o00Ooo.OooO0o0(com.ninja.engine.o0o00OOO, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oO(com.ninja.engine.C0511o0o00OoO r7) {
        /*
            r6 = this;
            r6.OooOO0(r7)
            java.util.HashMap[] r7 = r6.OooO0Oo
            r0 = 1
            r1 = r7[r0]
            java.lang.String r2 = "MakerNote"
            java.lang.Object r1 = r1.get(r2)
            com.ninja.engine.o0o00OOo r1 = (com.ninja.engine.C0508o0o00OOo) r1
            if (r1 == 0) goto Lc7
            com.ninja.engine.o0o00OoO r2 = new com.ninja.engine.o0o00OoO
            byte[] r1 = r1.OooO0Oo
            r2.<init>(r1)
            java.nio.ByteOrder r1 = r6.OooO0o
            r2.OooO0O0 = r1
            byte[] r1 = com.ninja.engine.C0512o0o00Ooo.OooOOoo
            int r3 = r1.length
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            r4 = 0
            r2.OooO0O0(r4)
            byte[] r4 = com.ninja.engine.C0512o0o00Ooo.OooOo00
            int r5 = r4.length
            byte[] r5 = new byte[r5]
            r2.readFully(r5)
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 == 0) goto L3e
            r3 = 8
        L3a:
            r2.OooO0O0(r3)
            goto L47
        L3e:
            boolean r1 = java.util.Arrays.equals(r5, r4)
            if (r1 == 0) goto L47
            r3 = 12
            goto L3a
        L47:
            r1 = 6
            r6.OooOOoo(r2, r1)
            r1 = 7
            r2 = r7[r1]
            java.lang.String r3 = "PreviewImageStart"
            java.lang.Object r2 = r2.get(r3)
            com.ninja.engine.o0o00OOo r2 = (com.ninja.engine.C0508o0o00OOo) r2
            r1 = r7[r1]
            java.lang.String r3 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r3)
            com.ninja.engine.o0o00OOo r1 = (com.ninja.engine.C0508o0o00OOo) r1
            if (r2 == 0) goto L73
            if (r1 == 0) goto L73
            r3 = 5
            r4 = r7[r3]
            java.lang.String r5 = "JPEGInterchangeFormat"
            r4.put(r5, r2)
            r2 = r7[r3]
            java.lang.String r3 = "JPEGInterchangeFormatLength"
            r2.put(r3, r1)
        L73:
            r1 = 8
            r1 = r7[r1]
            java.lang.String r2 = "AspectFrame"
            java.lang.Object r1 = r1.get(r2)
            com.ninja.engine.o0o00OOo r1 = (com.ninja.engine.C0508o0o00OOo) r1
            if (r1 == 0) goto Lc7
            java.nio.ByteOrder r2 = r6.OooO0o
            java.io.Serializable r1 = r1.OooO0oO(r2)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto Lc4
            int r2 = r1.length
            r3 = 4
            if (r2 == r3) goto L90
            goto Lc4
        L90:
            r2 = 2
            r2 = r1[r2]
            r3 = 0
            r4 = r1[r3]
            if (r2 <= r4) goto Lc7
            r5 = 3
            r5 = r1[r5]
            r1 = r1[r0]
            if (r5 <= r1) goto Lc7
            int r2 = r2 - r4
            int r2 = r2 + r0
            int r5 = r5 - r1
            int r5 = r5 + r0
            if (r2 >= r5) goto La9
            int r2 = r2 + r5
            int r5 = r2 - r5
            int r2 = r2 - r5
        La9:
            java.nio.ByteOrder r0 = r6.OooO0o
            com.ninja.engine.o0o00OOo r0 = com.ninja.engine.C0508o0o00OOo.OooO0OO(r2, r0)
            java.nio.ByteOrder r1 = r6.OooO0o
            com.ninja.engine.o0o00OOo r1 = com.ninja.engine.C0508o0o00OOo.OooO0OO(r5, r1)
            r2 = r7[r3]
            java.lang.String r4 = "ImageWidth"
            r2.put(r4, r0)
            r7 = r7[r3]
            java.lang.String r0 = "ImageLength"
            r7.put(r0, r1)
            goto Lc7
        Lc4:
            java.util.Arrays.toString(r1)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0512o0o00Ooo.OooO0oO(com.ninja.engine.o0o00OoO):void");
    }

    public final void OooO0oo(C0507o0o00OOO c0507o0o00OOO) {
        if (OooOO0o) {
            Objects.toString(c0507o0o00OOO);
        }
        c0507o0o00OOO.OooO0O0 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = OooOo0;
        c0507o0o00OOO.OooO00o(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = c0507o0o00OOO.readInt();
                byte[] bArr2 = new byte[4];
                if (c0507o0o00OOO.read(bArr2) == 4) {
                    int i = length + 8;
                    if (i == 16 && !Arrays.equals(bArr2, OooOo0o)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, OooOo)) {
                        if (Arrays.equals(bArr2, OooOo0O)) {
                            byte[] bArr3 = new byte[readInt];
                            if (c0507o0o00OOO.read(bArr3) == readInt) {
                                int readInt2 = c0507o0o00OOO.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.OooO0oo = i;
                                    OooOOo(bArr3, 0);
                                    OooOo();
                                    OooOo0(new C0507o0o00OOO(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0692o0ooooOo.OooO(bArr2));
                        }
                        int i2 = readInt + 4;
                        c0507o0o00OOO.OooO00o(i2);
                        length = i + i2;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void OooOO0(C0511o0o00OoO c0511o0o00OoO) {
        OooOOOO(c0511o0o00OoO);
        OooOOoo(c0511o0o00OoO, 0);
        OooOo0o(c0511o0o00OoO, 0);
        OooOo0o(c0511o0o00OoO, 5);
        OooOo0o(c0511o0o00OoO, 4);
        OooOo();
        if (this.OooO0OO == 8) {
            HashMap[] hashMapArr = this.OooO0Oo;
            C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) hashMapArr[1].get("MakerNote");
            if (c0508o0o00OOo != null) {
                C0511o0o00OoO c0511o0o00OoO2 = new C0511o0o00OoO(c0508o0o00OOo.OooO0Oo);
                c0511o0o00OoO2.OooO0O0 = this.OooO0o;
                c0511o0o00OoO2.OooO00o(6);
                OooOOoo(c0511o0o00OoO2, 9);
                C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMapArr[9].get("ColorSpace");
                if (c0508o0o00OOo2 != null) {
                    hashMapArr[1].put("ColorSpace", c0508o0o00OOo2);
                }
            }
        }
    }

    public final void OooOO0O(C0511o0o00OoO c0511o0o00OoO) {
        if (OooOO0o) {
            Objects.toString(c0511o0o00OoO);
        }
        OooOO0(c0511o0o00OoO);
        HashMap[] hashMapArr = this.OooO0Oo;
        C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) hashMapArr[0].get("JpgFromRaw");
        if (c0508o0o00OOo != null) {
            OooO0o0(new C0507o0o00OOO(c0508o0o00OOo.OooO0Oo), (int) c0508o0o00OOo.OooO0OO, 5);
        }
        C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMapArr[0].get("ISO");
        C0508o0o00OOo c0508o0o00OOo3 = (C0508o0o00OOo) hashMapArr[1].get("PhotographicSensitivity");
        if (c0508o0o00OOo2 != null && c0508o0o00OOo3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", c0508o0o00OOo2);
        }
    }

    public final void OooOO0o(C0507o0o00OOO c0507o0o00OOO) {
        if (OooOO0o) {
            Objects.toString(c0507o0o00OOO);
        }
        c0507o0o00OOO.OooO0O0 = ByteOrder.LITTLE_ENDIAN;
        c0507o0o00OOO.OooO00o(OooOoO0.length);
        int readInt = c0507o0o00OOO.readInt() + 8;
        byte[] bArr = OooOoO;
        c0507o0o00OOO.OooO00o(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0507o0o00OOO.read(bArr2) == 4) {
                    int readInt2 = c0507o0o00OOO.readInt();
                    int i = length + 8;
                    if (Arrays.equals(OooOoOO, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (c0507o0o00OOO.read(bArr3) == readInt2) {
                            this.OooO0oo = i;
                            OooOOo(bArr3, 0);
                            OooOo0(new C0507o0o00OOO(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0692o0ooooOo.OooO(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        c0507o0o00OOO.OooO00o(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final boolean OooOOO(HashMap hashMap) {
        C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) hashMap.get("ImageLength");
        C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMap.get("ImageWidth");
        if (c0508o0o00OOo != null && c0508o0o00OOo2 != null) {
            int OooO0o0 = c0508o0o00OOo.OooO0o0(this.OooO0o);
            int OooO0o02 = c0508o0o00OOo2.OooO0o0(this.OooO0o);
            if (OooO0o0 <= 512 && OooO0o02 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void OooOOO0(C0507o0o00OOO c0507o0o00OOO, HashMap hashMap) {
        C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) hashMap.get("JPEGInterchangeFormat");
        C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMap.get("JPEGInterchangeFormatLength");
        if (c0508o0o00OOo != null && c0508o0o00OOo2 != null) {
            int OooO0o0 = c0508o0o00OOo.OooO0o0(this.OooO0o);
            int OooO0o02 = c0508o0o00OOo2.OooO0o0(this.OooO0o);
            if (this.OooO0OO == 7) {
                OooO0o0 += this.OooO;
            }
            if (OooO0o0 > 0 && OooO0o02 > 0 && this.OooO0O0 == null && this.OooO00o == null) {
                c0507o0o00OOO.skip(OooO0o0);
                c0507o0o00OOO.read(new byte[OooO0o02]);
            }
        }
    }

    public final void OooOOOO(C0507o0o00OOO c0507o0o00OOO) {
        ByteOrder OooOOo02 = OooOOo0(c0507o0o00OOO);
        this.OooO0o = OooOOo02;
        c0507o0o00OOO.OooO0O0 = OooOOo02;
        int readUnsignedShort = c0507o0o00OOO.readUnsignedShort();
        int i = this.OooO0OO;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0507o0o00OOO.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                c0507o0o00OOO.OooO00o(i2);
                return;
            }
            return;
        }
        throw new IOException(AbstractC1230oOoOo0o.OooO0o(readInt, "Invalid first Ifd offset: "));
    }

    public final void OooOOOo() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.OooO0Oo;
            if (i < hashMapArr.length) {
                hashMapArr[i].size();
                for (Map.Entry entry : hashMapArr[i].entrySet()) {
                    C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) entry.getValue();
                    String str = (String) entry.getKey();
                    c0508o0o00OOo.toString();
                    c0508o0o00OOo.OooO0o(this.OooO0o);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void OooOOo(byte[] bArr, int i) {
        C0511o0o00OoO c0511o0o00OoO = new C0511o0o00OoO(bArr);
        OooOOOO(c0511o0o00OoO);
        OooOOoo(c0511o0o00OoO, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOoo(com.ninja.engine.C0511o0o00OoO r29, int r30) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0512o0o00Ooo.OooOOoo(com.ninja.engine.o0o00OoO, int):void");
    }

    public final void OooOo() {
        OooOo0O(0, 5);
        OooOo0O(0, 4);
        OooOo0O(5, 4);
        HashMap[] hashMapArr = this.OooO0Oo;
        C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) hashMapArr[1].get("PixelXDimension");
        C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMapArr[1].get("PixelYDimension");
        if (c0508o0o00OOo != null && c0508o0o00OOo2 != null) {
            hashMapArr[0].put("ImageWidth", c0508o0o00OOo);
            hashMapArr[0].put("ImageLength", c0508o0o00OOo2);
        }
        if (hashMapArr[4].isEmpty() && OooOOO(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        OooOOO(hashMapArr[4]);
        OooOo00(0, "ThumbnailOrientation", "Orientation");
        OooOo00(0, "ThumbnailImageLength", "ImageLength");
        OooOo00(0, "ThumbnailImageWidth", "ImageWidth");
        OooOo00(5, "ThumbnailOrientation", "Orientation");
        OooOo00(5, "ThumbnailImageLength", "ImageLength");
        OooOo00(5, "ThumbnailImageWidth", "ImageWidth");
        OooOo00(4, "Orientation", "ThumbnailOrientation");
        OooOo00(4, "ImageLength", "ThumbnailImageLength");
        OooOo00(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void OooOo0(C0507o0o00OOO c0507o0o00OOO) {
        C0508o0o00OOo c0508o0o00OOo;
        HashMap hashMap = this.OooO0Oo[4];
        C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMap.get("Compression");
        if (c0508o0o00OOo2 != null) {
            int OooO0o0 = c0508o0o00OOo2.OooO0o0(this.OooO0o);
            if (OooO0o0 != 1) {
                if (OooO0o0 != 6) {
                    if (OooO0o0 != 7) {
                        return;
                    }
                } else {
                    OooOOO0(c0507o0o00OOO, hashMap);
                    return;
                }
            }
            C0508o0o00OOo c0508o0o00OOo3 = (C0508o0o00OOo) hashMap.get("BitsPerSample");
            if (c0508o0o00OOo3 != null) {
                int[] iArr = (int[]) c0508o0o00OOo3.OooO0oO(this.OooO0o);
                int[] iArr2 = OooOOO0;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.OooO0OO == 3 && (c0508o0o00OOo = (C0508o0o00OOo) hashMap.get("PhotometricInterpretation")) != null) {
                        int OooO0o02 = c0508o0o00OOo.OooO0o0(this.OooO0o);
                        if ((OooO0o02 != 1 || !Arrays.equals(iArr, OooOOO)) && (OooO0o02 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C0508o0o00OOo c0508o0o00OOo4 = (C0508o0o00OOo) hashMap.get("StripOffsets");
                C0508o0o00OOo c0508o0o00OOo5 = (C0508o0o00OOo) hashMap.get("StripByteCounts");
                if (c0508o0o00OOo4 != null && c0508o0o00OOo5 != null) {
                    long[] OooOOO2 = AbstractC0692o0ooooOo.OooOOO(c0508o0o00OOo4.OooO0oO(this.OooO0o));
                    long[] OooOOO3 = AbstractC0692o0ooooOo.OooOOO(c0508o0o00OOo5.OooO0oO(this.OooO0o));
                    if (OooOOO2 != null && OooOOO2.length != 0 && OooOOO3 != null && OooOOO3.length != 0 && OooOOO2.length == OooOOO3.length) {
                        long j = 0;
                        for (long j2 : OooOOO3) {
                            j += j2;
                        }
                        byte[] bArr = new byte[(int) j];
                        this.OooO0oO = true;
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < OooOOO2.length; i3++) {
                            int i4 = (int) OooOOO2[i3];
                            int i5 = (int) OooOOO3[i3];
                            if (i3 < OooOOO2.length - 1 && i4 + i5 != OooOOO2[i3 + 1]) {
                                this.OooO0oO = false;
                            }
                            int i6 = i4 - i;
                            if (i6 >= 0) {
                                long j3 = i6;
                                if (c0507o0o00OOO.skip(j3) == j3) {
                                    int i7 = i + i6;
                                    byte[] bArr2 = new byte[i5];
                                    if (c0507o0o00OOO.read(bArr2) == i5) {
                                        i = i7 + i5;
                                        System.arraycopy(bArr2, 0, bArr, i2, i5);
                                        i2 += i5;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (this.OooO0oO) {
                            long j4 = OooOOO2[0];
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        OooOOO0(c0507o0o00OOO, hashMap);
    }

    public final void OooOo00(int i, String str, String str2) {
        HashMap[] hashMapArr = this.OooO0Oo;
        if (!hashMapArr[i].isEmpty() && hashMapArr[i].get(str) != null) {
            HashMap hashMap = hashMapArr[i];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i].remove(str);
        }
    }

    public final void OooOo0O(int i, int i2) {
        HashMap[] hashMapArr = this.OooO0Oo;
        if (!hashMapArr[i].isEmpty() && !hashMapArr[i2].isEmpty()) {
            C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) hashMapArr[i].get("ImageLength");
            C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMapArr[i].get("ImageWidth");
            C0508o0o00OOo c0508o0o00OOo3 = (C0508o0o00OOo) hashMapArr[i2].get("ImageLength");
            C0508o0o00OOo c0508o0o00OOo4 = (C0508o0o00OOo) hashMapArr[i2].get("ImageWidth");
            if (c0508o0o00OOo != null && c0508o0o00OOo2 != null && c0508o0o00OOo3 != null && c0508o0o00OOo4 != null) {
                int OooO0o0 = c0508o0o00OOo.OooO0o0(this.OooO0o);
                int OooO0o02 = c0508o0o00OOo2.OooO0o0(this.OooO0o);
                int OooO0o03 = c0508o0o00OOo3.OooO0o0(this.OooO0o);
                int OooO0o04 = c0508o0o00OOo4.OooO0o0(this.OooO0o);
                if (OooO0o0 < OooO0o03 && OooO0o02 < OooO0o04) {
                    HashMap hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    public final void OooOo0o(C0511o0o00OoO c0511o0o00OoO, int i) {
        C0508o0o00OOo OooO0OO;
        C0508o0o00OOo OooO0OO2;
        HashMap[] hashMapArr = this.OooO0Oo;
        C0508o0o00OOo c0508o0o00OOo = (C0508o0o00OOo) hashMapArr[i].get("DefaultCropSize");
        C0508o0o00OOo c0508o0o00OOo2 = (C0508o0o00OOo) hashMapArr[i].get("SensorTopBorder");
        C0508o0o00OOo c0508o0o00OOo3 = (C0508o0o00OOo) hashMapArr[i].get("SensorLeftBorder");
        C0508o0o00OOo c0508o0o00OOo4 = (C0508o0o00OOo) hashMapArr[i].get("SensorBottomBorder");
        C0508o0o00OOo c0508o0o00OOo5 = (C0508o0o00OOo) hashMapArr[i].get("SensorRightBorder");
        if (c0508o0o00OOo != null) {
            if (c0508o0o00OOo.OooO00o == 5) {
                C0509o0o00Oo[] c0509o0o00OoArr = (C0509o0o00Oo[]) c0508o0o00OOo.OooO0oO(this.OooO0o);
                if (c0509o0o00OoArr != null && c0509o0o00OoArr.length == 2) {
                    OooO0OO = C0508o0o00OOo.OooO0O0(c0509o0o00OoArr[0], this.OooO0o);
                    OooO0OO2 = C0508o0o00OOo.OooO0O0(c0509o0o00OoArr[1], this.OooO0o);
                } else {
                    Arrays.toString(c0509o0o00OoArr);
                    return;
                }
            } else {
                int[] iArr = (int[]) c0508o0o00OOo.OooO0oO(this.OooO0o);
                if (iArr != null && iArr.length == 2) {
                    OooO0OO = C0508o0o00OOo.OooO0OO(iArr[0], this.OooO0o);
                    OooO0OO2 = C0508o0o00OOo.OooO0OO(iArr[1], this.OooO0o);
                } else {
                    Arrays.toString(iArr);
                    return;
                }
            }
            hashMapArr[i].put("ImageWidth", OooO0OO);
            hashMapArr[i].put("ImageLength", OooO0OO2);
        } else if (c0508o0o00OOo2 != null && c0508o0o00OOo3 != null && c0508o0o00OOo4 != null && c0508o0o00OOo5 != null) {
            int OooO0o0 = c0508o0o00OOo2.OooO0o0(this.OooO0o);
            int OooO0o02 = c0508o0o00OOo4.OooO0o0(this.OooO0o);
            int OooO0o03 = c0508o0o00OOo5.OooO0o0(this.OooO0o);
            int OooO0o04 = c0508o0o00OOo3.OooO0o0(this.OooO0o);
            if (OooO0o02 > OooO0o0 && OooO0o03 > OooO0o04) {
                C0508o0o00OOo OooO0OO3 = C0508o0o00OOo.OooO0OO(OooO0o02 - OooO0o0, this.OooO0o);
                C0508o0o00OOo OooO0OO4 = C0508o0o00OOo.OooO0OO(OooO0o03 - OooO0o04, this.OooO0o);
                hashMapArr[i].put("ImageLength", OooO0OO3);
                hashMapArr[i].put("ImageWidth", OooO0OO4);
            }
        } else {
            C0508o0o00OOo c0508o0o00OOo6 = (C0508o0o00OOo) hashMapArr[i].get("ImageLength");
            C0508o0o00OOo c0508o0o00OOo7 = (C0508o0o00OOo) hashMapArr[i].get("ImageWidth");
            if (c0508o0o00OOo6 == null || c0508o0o00OOo7 == null) {
                C0508o0o00OOo c0508o0o00OOo8 = (C0508o0o00OOo) hashMapArr[i].get("JPEGInterchangeFormat");
                C0508o0o00OOo c0508o0o00OOo9 = (C0508o0o00OOo) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (c0508o0o00OOo8 != null && c0508o0o00OOo9 != null) {
                    int OooO0o05 = c0508o0o00OOo8.OooO0o0(this.OooO0o);
                    int OooO0o06 = c0508o0o00OOo8.OooO0o0(this.OooO0o);
                    c0511o0o00OoO.OooO0O0(OooO0o05);
                    byte[] bArr = new byte[OooO0o06];
                    c0511o0o00OoO.read(bArr);
                    OooO0o0(new C0507o0o00OOO(bArr), OooO0o05, i);
                }
            }
        }
    }
}
