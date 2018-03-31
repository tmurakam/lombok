package com.sun.tools.javac.util;

import com.sun.tools.javac.util.JCDiagnostic.*;
import com.sun.tools.javac.util.JCDiagnostic.Error;
import com.sun.tools.javac.util.JCDiagnostic.Warning;
import com.sun.tools.javac.util.JCDiagnostic.Note;

import javax.tools.JavaFileObject;

public class Log {
	public static Log instance(Context context) { return null; }

	// before JDK9
	public boolean multipleErrors;
	public void error(DiagnosticPosition pos, String key, Object... args) {}
	public void warning(DiagnosticPosition pos, String key, Object... args) {}
	public void mandatoryWarning(DiagnosticPosition pos, String key, Object... args) {}
	public void note(DiagnosticPosition pos, String key, Object... args) {}
	public JavaFileObject useSource(JavaFileObject file) {return null;}

	// JDK9 or later
	public void error(DiagnosticFlag flag, DiagnosticPosition pos, Error key) {}
	public void warning(DiagnosticPosition pos, Warning key) {}
	public void mandatoryWarning(DiagnosticPosition pos, Warning key) {}
	public void note(DiagnosticPosition pos, Note key) {}
}
