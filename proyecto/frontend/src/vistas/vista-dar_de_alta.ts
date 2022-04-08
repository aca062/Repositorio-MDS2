import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-dar_de_alta')
export class VistaDar_de_alta extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutPrincipal">
 <h1 style="margin-left: 10%;" id="h1Titulo">Altas</h1>
 <vaadin-vertical-layout id="layoutAdministracion" style="align-self: center; align-items: center; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl); width: 90%;">
  <vaadin-horizontal-layout theme="" style="width: 100%; justify-content: space-evenly;" id="layoutBotones">
   <vaadin-button id="botonArtistas">
     Artistas 
   </vaadin-button>
   <vaadin-button id="botonCanciones">
     Canciones 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="" id="layoutBotones1" style="width: 100%; justify-content: space-evenly; margin-top: var(--lumo-space-l);">
   <vaadin-button id="botonAlbumes">
     Álbumes 
   </vaadin-button>
   <vaadin-button id="botonEstilos">
     Estilos 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
