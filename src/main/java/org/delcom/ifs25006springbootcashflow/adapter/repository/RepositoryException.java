package org.delcom.ifs25006springbootcashflow.adapter.repository;

/** Kegagalan teknis akses database (bukan pelanggaran aturan domain). */
public class RepositoryException extends RuntimeException {
    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
