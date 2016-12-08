set NODE=versionNumber
set XML=AndroidManifest.xml
for /f "tokens=2 delims=>" %%i in ('findstr "<%NODE%>" %XML%') do (
    for /f "delims=<" %%i in ("%%i")do (
        echo %%i
    )
)

pause