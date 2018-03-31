package com.sun.tools.javac.util;

import com.sun.tools.javac.tree.JCTree;

import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import java.util.Locale;

public class JCDiagnostic implements Diagnostic<JavaFileObject> {
	public enum DiagnosticFlag {
		MANDATORY,
		RESOLVE_ERROR,
		SYNTAX,
		RECOVERABLE,
		NON_DEFERRABLE,
		COMPRESSED,
		MULTIPLE,
		SOURCE_LEVEL
	}

	public interface DiagnosticPosition {
		JCTree getTree();
		int getStartPosition();
	}

	public static class Error {
	}

	public static class Warning {
	}

	public static class Note {
	}

	@Override
	public Kind getKind() {
		return null;
	}

	@Override
	public JavaFileObject getSource() {
		return null;
	}

	@Override
	public long getPosition() {
		return 0;
	}

	@Override
	public long getStartPosition() {
		return 0;
	}

	@Override
	public long getEndPosition() {
		return 0;
	}

	@Override
	public long getLineNumber() {
		return 0;
	}

	@Override
	public long getColumnNumber() {
		return 0;
	}

	@Override
	public String getCode() {
		return null;
	}

	@Override
	public String getMessage(Locale locale) {
		return null;
	}
}
